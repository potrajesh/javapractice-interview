package CGI.answers;

//how many typecasting types
public  class TypeCastingTypes {

    //2 types(primitive typecating,reference typecasting)

    /* 1. primitive typecating(widening,narrowing)
    1.widening:
     Automatically performed by the compiler.
     Converts a smaller data type to a larger data type
     int num = 10;
     double d = num; // int to double (widening)

     //2,narrowing
      Requires explicit casting using parentheses.
     Converts a larger data type to a smaller data type.
     double d = 9.8;
    int num = (int) d;
 ===========================
         2. Reference Typecasting
     This involves converting between reference types (e.g., objects, interfaces).

     Types:
     Upcasting (Implicit):

     Converts a subclass type to a superclass type.
     Always safe and doesn't require explicit casting.
     Example:
     java
     class Animal {}
     class Dog extends Animal {}

     Animal a = new Dog(); // Upcasting
 ======================================
     Downcasting (Explicit):

     Converts a superclass type to a subclass type.
     Requires explicit casting and may throw a ClassCastException at runtime if types are incompatible.
     Example:

     Animal a = new Dog(); // Upcasting
     Dog d = (Dog) a;      // Downcasting

     Key Notes:
Primitive casting is for basic data types, while reference casting is for objects and classes.
Always handle downcasting cautiously, as it can lead to runtime exceptions. Use instanceof to check compatibility:
java
Copy code
if (a instanceof Dog) {
    Dog d = (Dog) a;
}
     */
    public static void main(String[] args) {
        System.out.println("hello");
    }
}