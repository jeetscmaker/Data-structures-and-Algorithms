package stack;

/**
 * Simple array based implementation of Stack data structure.
 */
public class Stack {
	// length of the array used to implement stack.
	protected int capacity;
	// Default array capacity.
	public static final int CAPACITY = 10;
	// Array used to implement stack.
	protected int[] stackRep;
	// index of the top element in the stack;
	protected int top = -1;

	// initialize the stak with default capacity
	public Stack() {
		this(CAPACITY);
	}

	public Stack(int cap) {
		this.capacity = cap;
		stackRep = new int[capacity];
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top < 0;
	}

	// insert an element.
	public void push(int data) throws Exception {
		if (size() == capacity)
			throw new Exception("Stack is full");
		stackRep[++top] = data;
	}

	// Removes the element from the top of the stack.
	public int pop() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is empty.");
		int data = stackRep[top];
		stackRep[top--] = Integer.MIN_VALUE;
		return data;
	}

	// Return a string representation of the stack.
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		if (size() == 0)
			return sb.append("]").toString();
		sb.append(stackRep[0]);
		if (size() > 1) {
			for (int i = 1; i < stackRep.length; i++) {
				sb.append(",").append(stackRep[i]);
			}
			sb.append("]");
		}
		return sb.toString();

	}
}
