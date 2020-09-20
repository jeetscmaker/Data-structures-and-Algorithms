package linkedList;
/**
 * A Double LinkedList data structure.
 */
public class DoubleLinkedList {
    private DLLNode head;
    private DLLNode tail;
    private  int length;

    // Create an empty list.
    public DoubleLinkedList(){
        head = new DLLNode(Integer.MIN_VALUE, null, null);
        tail = new DLLNode(Integer.MIN_VALUE, head, null);
        head.setNext(tail);
        length = 0;
    }
    // Find the position of the given value in the LinkedList.
    public int getPosition(int data){
        DLLNode temp = head;
        int pos = 0;
        while (temp != null){
            if(temp.getData() == data){
                return pos;
            }
            pos++;
            temp = temp.getNext();
        }
        //else return -1, which means the node not found.
        return -1;
    }
}
