package linkedList;

/**
 * A Double LinkedList data structure.
 */
public class DoubleLinkedList {
    private DLLNode head;
    private DLLNode tail;
    private int length;

    // Create an empty list.
    public DoubleLinkedList() {
        head = new DLLNode(Integer.MIN_VALUE, null, null);
        tail = new DLLNode(Integer.MIN_VALUE, head, null);
        head.setNext(tail);
        length = 0;
    }

    public int getLength() {
        return length;
    }

    // Find the position of the given value in the LinkedList.
    public int getPosition(int data) {
        DLLNode temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.getData() == data) {
                return pos;
            }
            pos++;
            temp = temp.getNext();
        }
        //else return -1, which means the node not found.
        return -1;
    }

    //Add a value at the front of the list.
    public void insert(int data) {
        DLLNode node = new DLLNode(data, head, head.getNext());
        node.getNext().setPrev(node);
        head.setNext(node);
        length++;
    }

    // Add a new value at a given position
    public void insert(int data, int position) {
        // fix the position
        if (position < 0)
            position = 0;
        if (position > length)
            position = length;
        // if the list is empty make it the first element.
        if (head == null) {
            head = new DLLNode(data);
            tail = head;
        }
        // if adding at the front
        else if (position == 0) {
            DLLNode node = new DLLNode(data);
            node.setNext(head);
            head = node;
        } else {
            DLLNode temp = head;
            for (int i = 0; i < position; i++) {
                temp = temp.getNext();
            }
            DLLNode node = new DLLNode(data);
            node.setNext(temp.getNext());
            node.setPrev(temp);
            node.getNext().setPrev(node);
            temp.setNext(node);
        }
        length = length + 1;
    }
    // Add a new value at the rear of the list(before tail).
    public void insertTail(int data){
        DLLNode node  = new DLLNode(data, tail.getPrev(),tail);
        node.getPrev().setNext(node);
        tail.setPrev(node);
        length++;
    }
}
