class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class OneNode {
    public static void main(String[] args) {
        Node head = new Node(42);

        System.out.println("Node data: " + head.data);
    }
}
