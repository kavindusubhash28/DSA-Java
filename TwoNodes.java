class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class TwoNodes {
    public static void main(String[] args) {
        Node first = new Node(5);
        Node second = new Node(10);

        first.next = second;

        System.out.println(first.data);
        System.out.println(first.next.data);
    }
}
