class CustomLinkedList {
    // Node inner class
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head node of the list

    public CustomLinkedList() {
        this.head = null;
    }

    // Method to add an element at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the LinkedList
    public void display() {
        if (head == null) {
            System.out.println("The LinkedList is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Main class to test CustomLinkedList
public class CustomLinkedListExample {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original LinkedList:");
        list.display();

        System.out.println("Deleting 30...");
        list.display();
    }
}
