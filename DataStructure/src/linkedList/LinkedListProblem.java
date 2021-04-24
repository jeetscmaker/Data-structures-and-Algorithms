package linkedList;

public class LinkedListProblem {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(10);
        ListNode l3 = new ListNode(15);
        ListNode l4 = new ListNode(25);
        ListNode l5 = new ListNode(35);
        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);
        l4.setNext(l5);
        // prepare the LinkedList by assigning the head.
        ll.setHead(l1);
        // print the linkedList before reverse().
        ll.printLinkedList();
        // Reversal
        ll.setHead(reverse(ll));
        // print the linkedList after reverse()
        ll.printLinkedList();
    }
    // Reverse a given single LinkedList
    private static ListNode reverse(LinkedList ll){
        ListNode prev = null, current = ll.getHead();
        ListNode nextNode;
        while (current != null){
            nextNode = current.getNext();
            current.setNext(prev);
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}
