class Node {
	int data;
	Node next;
	Node(int data) {this.data = data; }
}

public class PrintList {
	public static void printList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
	}
}

public static void main(String[] args) {
	Node head = new Node(1);
	head.next = new Node(2);
	head.next.next = new Node(3);
	printList(head);
	}
}
		
		