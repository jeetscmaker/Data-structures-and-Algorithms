package linkedList;

/**
 * This class is a fundamental data structure for a circular LinkedList.
 */
public class CLLNode {
	private int data;
	CLLNode next;

	public CLLNode() {
		this.data = 0;
		this.next = null;
	}

	public CLLNode(int data) {
		this.data = data;
		this.next = null;
	}

	public CLLNode(int data, CLLNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public CLLNode getNext() {
		return next;
	}

	public void setNext(CLLNode next) {
		this.next = next;
	}

}
