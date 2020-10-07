package queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue() + " dequeued from queue\n");
        System.out.println("Front item is " + queue.front());
        System.out.println("Rear item is " + queue.rear());

        Queue2 queue2 = new Queue2();
        queue2.enqueue(10);
        queue2.enqueue(20);
        queue2.enqueue(30);
        queue2.enqueue(40);
        System.out.println("The LinkedList queue is: " + queue2);
    }
}
