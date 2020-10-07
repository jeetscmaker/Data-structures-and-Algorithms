package queue;

import linkedList.ListNode;

/**
 * LinkedList based implementation of Queue data structure.
 */
public class Queue2 {
    private int length;
    private ListNode front, rear;

    public Queue2() {
        length = 0;
        front = rear = null;
    }

    /* insert element at the end of the queue. */
    public void enqueue(int data) {
        ListNode node = new ListNode(data);
        if (isEmpty())
            front = node;
        else
            rear.setNext(node);
        rear = node;
        length++;
    }

    /* Remove an element from the front of the queue. */
    public int dequeue() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty, cannot delete from an empty queue.");
        int data = front.getData();
        front = front.getNext();
        length--;
        if (isEmpty())
            rear = null;
        return data;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        return length;
    }

    // Return a string representation of the stack.
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (size() == 0)
            return sb.append("]").toString();
        sb.append(front.getData());
        ListNode current = front.getNext();
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
