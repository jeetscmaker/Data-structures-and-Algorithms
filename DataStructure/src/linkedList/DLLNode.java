package linkedList;

/**
 * This class is a fundamental data structure for a double LinkedList.
 */
public class DLLNode {
    private int data;
    private DLLNode prev;
    private DLLNode next;

    public DLLNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public DLLNode(int data, DLLNode prev, DLLNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public DLLNode() {
        this.data = 0;
        this.prev = null;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DLLNode getPrev() {
        return prev;
    }

    public void setPrev(DLLNode prev) {
        this.prev = prev;
    }

    public DLLNode getNext() {
        return next;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }
}
