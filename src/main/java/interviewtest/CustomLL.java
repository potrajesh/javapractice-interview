public class CustomLL {

    /*
    *
    * header!data!next!
    * */
    class Node{
        int data;
        Node next = null;

        public Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    private Node head; // Head node of the list

    public void add(int data) {
        CustomLL.Node newNode = new CustomLL.Node(data);
        if (head == null) {
            head = newNode;
        } else {
            CustomLL.Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public static void main(String[] args) {
        CustomLL list = new CustomLL();
        list.add(10);
        System.out.println("Original LinkedList:");
    }
}