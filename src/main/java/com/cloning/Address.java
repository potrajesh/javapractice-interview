package com.cloning;

class Address {
    String street;
    String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Copy constructor for deep copy
    public Address(Address address) {
        this.street = address.street;
        this.city = address.city;
    }

    @Override
    public String toString() {
        return street + ", " + city;
    }
}

class Person implements Cloneable {
    String name;                // Primitive field
    int age;                   // Primitive field
    Address[] addresses;       // Reference field (array of Address)

    public Person(String name, int age, Address[] addresses) {
        this.name = name;
        this.age = age;
        this.addresses = addresses;
    }

    // Deep copy implementation
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Call the Object's clone method to create the shallow copy
        Person cloned = (Person) super.clone();
        
        // Deep copy the addresses array
        cloned.addresses = new Address[this.addresses.length];
        for (int i = 0; i < this.addresses.length; i++) {
            cloned.addresses[i] = new Address(this.addresses[i]); // Using copy constructor
        }
        
        return cloned;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Person{name='" + name + "', age=" + age + ", addresses=[");
        for (Address address : addresses) {
            sb.append(address.toString()).append(", ");
        }
        sb.setLength(sb.length() - 2); // Remove last comma and space
        sb.append("]}");
        return sb.toString();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address[] addresses = {
            new Address("123 Main St", "New York"),
            new Address("456 Elm St", "Los Angeles")
        };

        Person original = new Person("John Doe", 30, addresses);
        Person deepClone = (Person) original.clone(); // Perform deep cloning

        // Modify the clone's addresses
        deepClone.addresses[0].street = "789 Oak St";

        // Output original and cloned objects
        System.out.println("Original: " + original);
        System.out.println("Deep Clone: " + deepClone);
    }
}
