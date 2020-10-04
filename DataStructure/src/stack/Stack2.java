package stack;

/**
 * Dynamic array based implementation of Stack data structure.
 */
public class Stack2 {

	// length of the array used to implement stack.
	protected int capacity;
	// Default array capacity.
	public static final int CAPACITY = 16;
	public static final int MIN_CAPACITY = 1 << 15;
	// Array used to implement stack.
	protected int[] stackRep;
	// index of the top element in the stack;
	protected int top = -1;

	// initialize the stak with default capacity
	public Stack2() {
		this(CAPACITY);
	}

	public Stack2(int cap) {
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
			expand();
		stackRep[++top] = data;
	}

	private void expand() {
		int length = size();
		int[] newStack = new int[length << 1];
		System.arraycopy(stackRep, 0, newStack, 0, length);
		stackRep = newStack;
	}

	// Removes the element from the top of the stack.
	public int pop() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is empty.");
		int data = stackRep[top];
		stackRep[top--] = Integer.MIN_VALUE;
		shrink();
		return data;
	}

	// Shrink the array to 1/2 if more than 3/4 array is empty.
	private void shrink() {
		int length = top + 1;
		if (length <= MIN_CAPACITY || top << 2 >= length)
			return;
		length = length + (top << 1);
		if (top < MIN_CAPACITY)
			length = MIN_CAPACITY;
		int[] newStack = new int[length];
		System.arraycopy(stackRep, 0, newStack, 0, top + 1);
		stackRep = newStack;
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
