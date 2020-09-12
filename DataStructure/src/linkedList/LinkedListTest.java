package linkedList;

public class LinkedListTest {
 public static void main(String[] args) {
	ListNode l1 = new ListNode(5);
	ListNode l2 = new ListNode(8);
	ListNode l3 = new ListNode(4);
	ListNode l4 = new ListNode(11);
	ListNode l5 = new ListNode(2);
	LinkedList list = new LinkedList();
	list.setHead(l1);
	l1.setNext(l2); l2.setNext(l3); l3.setNext(l4); l4.setNext(l5); l5.setNext(null);
	list.printLinkedList();
	list.printLinkedList();
}
}
