package HashMap;

import java.util.HashMap;

//Write a function to check if the linked list contain cycle ? hashMap 
public class Question {
	static Node head = null;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
		}
	}

	public static void main(String[] args) {

		create();
//		displayList(head);

		System.out.println(findCirculer(head));
	}

	public static void create() {
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);

		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;

		fourth.next = fifth;
		fifth.next = null;
	}

	public static void displayList(Node head) {
		int count = 0;
		if (head == null) {
			System.out.println("There is no nodes are present in the given linked list!!!");
			return;
		}
		Node temp = head;
		while (temp.next != head) {
			System.out.print(temp.data + "-->");
			temp = temp.next;

		}
		System.out.print(temp.data + "-->");
		System.out.print("Null\n");
	}

	public static boolean findCirculer(Node head) {
		HashMap<Node, Boolean> h = new HashMap<Node, Boolean>();
		Node temp = head;
		while (temp.next != null) {
			if (!h.containsKey(temp.next))
				h.put(temp.next, true);
			else
				return true;

			temp = temp.next;
		}
		return false;
	}
}
