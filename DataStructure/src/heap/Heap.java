package heap;

/**
 * @author Jitendra
 * A heap data structure is a tree with following properties:
 * i). value of the node must be >= its children( in max_heap)
 * value of the node must be <= its children( in min_heap)
 * ii). All the nodes should be at height h or h-1, where h is
 * the height of the tree.
 */
public class Heap {
    public int[] array;
    public int count;
    public int capacity;
    public int heapType; // max_heap or min_heap

    public Heap(int capacity, int heapType) {
        this.heapType = heapType;
        this.capacity = capacity;
        this.count = 0;
        this.array = new int[capacity];
    }

    /* Parent of a node. */
    public int parent(int i) {
        if (i <= 0 || i >= this.count)
            return -1;
        return (i - 1) / 2;
    }

    /* Getting the maximum element. */
    public int getMax() {
        if (this.count == 0)
            return -1;
        return this.array[0];
    }

    /* Children of a node. */
    public int leftChild(int i) {
        int left = 2 * i + 1;
        if (left >= this.count)
            return -1;
        return left;
    }

    /* Children of a node. */
    public int rightChild(int i) {
        int right = 2 * i + 2;
        if (right >= this.count)
            return -1;
        return right;
    }

    /* Heapifying the element at location i.
     * This operation is also called PercolateDown. */
    public void percolateDown(int i) {
        int l, r, maxIndex, temp;
        l = leftChild(i);
        r = rightChild(i);
        if (l != -1 && this.array[i] < this.array[l])
            maxIndex = l;
        else
            maxIndex = i;
        if (r != -1 && this.array[maxIndex] < this.array[r])
            maxIndex = r;
        if (maxIndex != i) {
            temp = this.array[i];
            this.array[i] = this.array[maxIndex];
            this.array[maxIndex] = temp;
        }
        percolateDown(maxIndex);
    }

    /**
     * Deleting an element from heap. We just need to delete the element from root.
     * i. copy the first element into some variable,
     * ii. copy the last element into first element's location,
     * iii. percolate down the first element.
     */
    public int deleteMax() {
        if (this.count == 0)
            return -1;
        int data = this.array[0];
        this.array[0] = this.array[count - 1];
        this.count--;
        percolateDown(0);
        return data;
    }

    /**
     * Inserting an element in a heap.
     * i. increase the heap size,
     * ii. keep the new element at the end of the heap,
     * iii. heapify the element from bottom to top.
     */
    public void insert(int data) {
        int temp;
        if (this.count == this.capacity)
            resizeHeap();
        this.count++;
        int i = this.count - 1;
        while (i >= 0 && data > this.array[(i - 1) / 2]) {
            temp = this.array[i];
            this.array[i] = this.array[(i - 1) / 2];
            this.array[(i - 1) / 2] = temp;
            i = (i - 1) / 2;
        }
        this.array[i] = data;
    }

    /* Resize the array if full. */
    private void resizeHeap() {
        int[] arr_old = new int[capacity];
        System.arraycopy(array, 0, arr_old, count - 1, count);
        array = new int[capacity * 2];
        if (array == null) {
            System.out.println("Memory error!");
            return;
        }
        for (int i = 0; i < this.capacity; i++) {
            array[i] = arr_old[i];
        }
        capacity = capacity * 2;
        arr_old = null;
    }

    /* Destroying the heap. */
    public void destroyHeap() {
        count = 0;
        array = null;
    }

    /* Build a heap or heapify an array. */
    public void buildHeap(Heap h, int[] a, int n) {
        if (h == null)
            return;
        while (n > h.capacity)
            h.resizeHeap();
        for (int i = 0; i < n; i++) {
            h.array[i] = a[i];
        }
        h.count = n;
        // heapify all the nodes except leaf nodes.
        // so start with (n-1)/2 indexed node and continue for lower indexed nodes.
        for (int i = (n - 1) / 2; i > 0; i--) {
            h.percolateDown(i);
        }
    }
}
