package sorting;

/**
 * Quick sort algorithm and its test cases.
 */
public class QuickSort {
    /* The quick sort method takes an array. */
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    /* This works on divide & conquer algorithm. */
    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);
        quickSort(arr, left, index - 1);
        quickSort(arr, index, right);
    }

    private static int partition(int[] arr, int left, int right, int pivot) {
        int temp;
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                // swap the left and right elements.
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println("***QUICK SORT***\n");
        int[] array = {5, 8, 1, 3, 9, 6};
        System.out.println("Before sorting the array: ");
        Utility.printArray(array);
        quickSort(array);
        System.out.println("After sorting the array: ");
        Utility.printArray(array);
    }
}
