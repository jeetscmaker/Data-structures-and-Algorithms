package sorting;

public class MergeSort {
	/* Divide and conquer algorithm of merge sort. */
	public static int[] mergeSort(int[] arr) {
		if (arr.length == 1)
			return arr;
		int mid = arr.length / 2;
		int[] left = new int[mid];
		int[] right;
		if (arr.length % 2 == 0)
			right = new int[mid];
		else
			right = new int[mid + 1];
		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = arr[mid + j];
		}
		int[] result = new int[arr.length];
		left = mergeSort(left);
		right = mergeSort(right);

		result = merge(left, right);

		return result;
	}

	private static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer = 0;

		while (leftPointer < left.length || rightPointer < right.length) {
			if (leftPointer < left.length && rightPointer < right.length) {
				if (left[leftPointer] < right[rightPointer]) {
					result[resultPointer++] = left[leftPointer++];
				} else {
					result[resultPointer++] = right[rightPointer++];
				}
			} else if (leftPointer < left.length) {
				result[resultPointer++] = left[leftPointer++];
			} else if (rightPointer < right.length) {
				result[resultPointer++] = right[rightPointer++];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 4, 3, 2, 1 };
		System.out.println("Before sorting the array:-");
		Utility.printArray(arr);
		arr = mergeSort(arr);
		System.out.println("After sorting the array:-");
		Utility.printArray(arr);
	}
}
