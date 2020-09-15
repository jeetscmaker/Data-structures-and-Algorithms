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
	 * length() method returns the total number of
	 * nodes in the linkedList calculation time O(n).
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
	
	/* Remove and return a node at the beginning of list. */
	public synchronized ListNode removeFirstElement() {
		ListNode node = head;
		if(node != null) {
			head = node.getNext();
			node.setNext(null);
		}
		return node;
	}
	
	/* Remove and return a node at the end of the list */
	public synchronized ListNode removeLastElement() {
		ListNode current = head, prev = head;
		// when list is empty
		if(head == null) return null;
		// when the list contains just 1 element.
		if(current.getNext() == null) {
			head = null;
			return current;
		}
		// when the list contains more elements.
		while(current.getNext() != null) {
			prev = current;
			current = current.getNext();
		}
		prev.setNext(null);
		return current;
	}
	
	/* Remove the value at a given position(index) */
	public void remove(int position) {
		// if list is empty, simply return.
		if(head == null) return; 
		// fix the position
		if(position < 0) position = 0;
		if(position >= length) position = length-1;
		
		//if removing first element
		if(position == 0)
			removeFirstElement();
		else if(position == length-1)
			removeLastElement();
		else {
			ListNode current = head, prev = head;
			for(int i=0; i<position; i++) {
				prev = current;
				current = current.getNext();
			}
			prev.setNext(current.getNext());
			current.setNext(null);
		}
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
