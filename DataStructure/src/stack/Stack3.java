package stack;

/**
 * LinkedList based implementation of Stack data structure.
 */

import java.util.EmptyStackException;

import linkedList.ListNode;

public class Stack3 {

	private int length;
	private ListNode top;

	public Stack3() {
		length = 0;
		top = null;
	}

	public void push(int data) {
		ListNode node = new ListNode(data);
		node.setNext(top);
		top = node;
		length++;
	}

	public int pop() {
		if (isEmpty())
			throw new EmptyStackException();
		int data = top.getData();
		length--;
		return data;
	}

	public int peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return top.getData();
	}

	public int size() {
		return length;
	}

	private boolean isEmpty() {
		return length == 0;
	}

	// Return a string representation of the stack.
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		if (size() == 0)
			return sb.append("]").toString();
		sb.append(top.getData());
		ListNode current = top.getNext();
		if (size() > 1) {
			while (current != null) {
				sb.append(",").append(current.getData());
				current = current.getNext();
			}
		}
		sb.append("]");
		return sb.toString();

	}
}
