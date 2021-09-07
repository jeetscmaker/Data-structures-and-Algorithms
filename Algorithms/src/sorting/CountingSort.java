package sorting;
/**
 * Counting sort for numbers between 0 to N;
 * A book keeping array(BKA) is an array whose indices are the values of
 * the original array. The content of this BKA is the count of occurrences
 * of the items in the original array.
 */
public class CountingSort {
    public static void main(String[] args) {
        int a[] = {1, 3, 6, 9, 9, 3, 5, 9};
        countingSort(a);
        for (int element : a) {
            System.out.print(element + " ");
        }
    }

    public static int[] countingSort(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = max < a[i] ? a[i] : max;
        }
        // Declaring a book_keeping_array of size one more
        // than the maximum element of the given array.
        int[] book_keeping_array = new int[max + 1];
        for (int i = 0; i < (max + 1); i++) {
            book_keeping_array[i] = 0;
        }
        for (int i = 0; i < a.length; i++) {
            book_keeping_array[a[i]]++;
        }
        int s, k = 0;
        for (int i = 0; i < max + 1; i++) {
            s = book_keeping_array[i];
            for (int j = 0; j < s; j++) {
                a[k] = i;
                k++;
            }
        }
        return a;
    }
}
