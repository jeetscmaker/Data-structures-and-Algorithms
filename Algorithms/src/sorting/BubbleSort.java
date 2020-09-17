package sorting;

public class BubbleSort {

	/* Bubble sort algorithm */
	public static int[] bubbleSort(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		System.out.println("***BUBBLE SORT***\n");
		int[] array = { 5, 8, 1, 3, 9, 6 };
		// before sorting array
		Utility.printArray(array);
		array = bubbleSort(array);
		// after sorting array
		Utility.printArray(array);
	}
}
