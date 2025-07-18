class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class FirstNode {
    public static void main(String[] args) {
        Node head = new Node(99);
        head.next = new Node(100);

        System.out.println("First element: " + head.data);
    }
}
