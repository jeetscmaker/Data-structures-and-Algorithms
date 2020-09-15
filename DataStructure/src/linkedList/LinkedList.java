package linkedList;

/**
 * A single LinkedList data structure.
 */
public class LinkedList {
	private int length = 0;
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
	public int length() {
		int n = 0;
		ListNode currentNode = head;
		while (currentNode != null) {
			n++;
			currentNode = currentNode.getNext();
		}
		length = n;
		return length;
	}

	/* Insert a node at the beginning of the list */
	public synchronized void insertAtBegin(ListNode node) {
		node.setNext(head);
		head = node;
		length++;
	}

	/* Insert a node at the end of the LinkedList */
	public synchronized void insertAtEnd(ListNode node) {
		if (head == null)
			head = node;
		else {
			ListNode current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
		}
		length++;
	}

	/*
	 * Insert a node at a given position, here position means exact position which
	 * is 1 more than the index
	 */
	public void insert(int data, int position) {
		// fix the position
		if (position < 0)
			position = 0;
		if (position > length)
			position = length;

		// if the list is empty, make it the only element.
		if (head == null)
			head = new ListNode(data);
		// adding at the front of the list
		else if (position == 0)
			insertAtBegin(new ListNode(data));
		// adding at the correct position of the list
		ListNode current = head;
		for (int i = 1; i < position; i++) {
			current = current.getNext();
		}
		ListNode newNode = new ListNode(data);
		newNode.setNext(current.getNext());
		current.setNext(newNode);
		// list length has now increased by 1.
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
