package sorting;

public class InsertionSort {
	
	/* This method takes an input array and sorts the elements and returns the sorted array back. */
	public static int[] insertionSort(int[] arr) {
		int i, j, temp, key;
		for(i=1; i<arr.length; i++) {
			j = i-1;
			key = arr[i];
			while(j>=0 && key < arr[j]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] array = {5, 8, 1, 3, 9, 6};
		// before sorting array
		Utility.printArray(array);
		array = insertionSort(array);
		// after sorting array
		Utility.printArray(array);
	}
}
