package problems;

import java.util.Queue;
import java.util.Stack;

/**
 * Reverse a given queue.
 */

public class QueueReversal {

    public static Queue<Integer> reverseQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<Integer>();
        while (!q.isEmpty()) {
            stack.push(q.poll());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        return q;
    }
}