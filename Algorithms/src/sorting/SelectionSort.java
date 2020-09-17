package sorting;

public class SelectionSort {
	/* Selection sort algorithm */
	public static int[] selectionSort(int[] arr) {
		int minIndex, temp;
		for (int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println("***SELECTION SORT***\n");
		int[] array = { 5, 8, 1, 3, 9, 6 };
		// before sorting array
		Utility.printArray(array);
		array = selectionSort(array);
		// after sorting array
		Utility.printArray(array);
	}
}
