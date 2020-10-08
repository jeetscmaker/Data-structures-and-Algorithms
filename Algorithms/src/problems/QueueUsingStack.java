package problems;

import java.util.Stack;

/**
 * Use two stacks and create a queue data structure.
 */

public class QueueUsingStack {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	public void enqueue(int data) {
		s1.push(data);
	}

	public int dequeue() {
		if (!s2.isEmpty())
			return s2.pop();
		else {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			return s2.pop();
		}
	}
}
