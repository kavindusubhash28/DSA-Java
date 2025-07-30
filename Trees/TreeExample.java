class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class TreeExample {
    public static void main(String[] args) {
        Node root = new Node(10);
        System.out.println("Root node value: " + root.data);
    }
}
