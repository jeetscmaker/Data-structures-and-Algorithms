package problems;

import java.util.Stack;

import queue.Queue;

/**
 * Reverse a given queue.
 */

public class QueueReversal {

	public static Queue reverseQueue(Queue q) {
		Stack<Integer> stack = new Stack<Integer>();
		while (!q.isEmpty(q)) {
			stack.push(q.dequeue());
		}
		while (!stack.isEmpty()) {
			q.enqueue(stack.pop());
		}
		return q;
	}
}