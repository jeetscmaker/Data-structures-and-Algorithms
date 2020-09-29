package linkedList;

/**
 * A Circular LinkedList data structure.
 */
public class CircularLinkedList {
	protected CLLNode tail; // call it head or tail.
	protected int length;
	
	public CircularLinkedList() {
		tail = null;
		length = 0;
	}
	
	/* Add data to the beginning of the list. */
	public void addToHead(int data) {
		CLLNode temp = new CLLNode(data);
		if(tail == null) {
			tail = temp;
			tail.setNext(tail);
		} else {
			temp.setNext(tail.getNext());
			tail.setNext(temp);
		}
		length++;
	}
	
	/* Add data to the tail of the list. */
	public void addToTail(int data) {
		addToHead(data);
		tail = tail.getNext();
	}
	
	/* This method finds out the length of the Circular Linked List. */
	public int length() {
		int length = 0;
		CLLNode currentNode = tail.getNext();
		while(currentNode != tail) {
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}
	
	/* print the elements of the circular LinkedList. */
	public void print() {
		CLLNode t = tail.getNext();
		while(t != tail) {
			System.out.print(t.getData() + "->");
			t = t.getNext();
		}
		System.out.print(t.getData());
	}
}
