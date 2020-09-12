package linkedList;

/**
 * A single LinkedList data structure.
 */
public class LinkedList {
	private int length;
	private ListNode head;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	/* Return the first node in the list */
	public synchronized ListNode getHead() {
		return head;
	}

	public void setHead(ListNode head) {
		this.head = head;
	}

	public LinkedList(int length, ListNode head) {
		this.length = length;
		this.head = head;
	}

	public LinkedList() {
		length = 0;
		head = null;
	}

	public LinkedList(ListNode head) {
		this.length = 0;
		this.head = head;
	}

	/*
	 * listLength function takes head node as input and returns the total number of
	 * nodes in the linkedList
	 */
	public int listLength(ListNode head) {
		int length = 0;
		ListNode currentNode = head;
		while (currentNode != null) {
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}

	/* Insert a node at the beginning of the list */
	public synchronized void insertAtBegin(ListNode node) {
		node.setNext(head);
		head = node;
		length++;
	}

	/* Print the nodes of a single LinkedList */
	public void printLinkedList() {
		ListNode current = head;
		while (current != null) {
			if (current.getNext() != null)
				System.out.print(current.getData() + "->");
			else
				System.out.println(current.getData());
			current = current.getNext();
		}
	}

}
