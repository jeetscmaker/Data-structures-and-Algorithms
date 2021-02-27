package problems;

/**
 * Find the maximum sum of a contiguous subarray of size k in a given array
 * Input  : arr[] = {100, 200, 300, 400}, k = 2, Output : 700 {300,400}
 * Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4, Output : 39 {4, 2, 10, 23}
 */
public class MaxContiguousSumSubarray {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400}; // k = 2
        System.out.println("Maximum sum contiguous subArray " + maxSum(arr, 2));
        int[] arr2 = {1, 4, 2, 10, 23, 3, 1, 0, 20}; // k = 4
        System.out.println("Maximum sum contiguous subArray for arr2 " + maxSum(arr2, 20));
    }

    public static int maxSum(int[] array, int k) {
        int maxSum = 0;
        int n = array.length, sum = 0;
        if (k > n) {
            System.err.println("K cannot be greater than size of the array.");
            return 0;
        }
        int startpointer = 0;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }
//        startpointer++;
        for (int i = k; i < n; i++) {
            if (maxSum < sum)
                maxSum = sum;
            sum = sum - array[startpointer] + array[i];
            startpointer++;
        }
        if (maxSum < sum)
            maxSum = sum;
        return maxSum;
    }

}
