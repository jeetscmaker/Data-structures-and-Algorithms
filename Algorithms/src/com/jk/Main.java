package com.jk;

public class Main {
	public static void main(String[] args) {
		int[] array = { 4, 3, 1, 6, 8, 11, 0, 9, 5 };
		int section = 3;
		System.out.println("The maximum among local minima is: " + maxInLocalMins_1(section, array));
		System.out.println("The maximum among local minima is: " + maxInLocalMins_2(section, array));
	}

	// This algorithm is not working as per requirement. It's wrong.

	public static int maxInLocalMins_1(int x, int[] arr) {
		int localMinimum = Integer.MAX_VALUE;
		for (int i = 0; i < x; i++) {
			if (arr[i] < localMinimum)
				localMinimum = arr[i];
		}
		int maximum = localMinimum;
		for (int i = x; i < arr.length; i++) {
			if (arr[i] < localMinimum)
				localMinimum = arr[i];
			if (localMinimum > maximum)
				maximum = localMinimum;
		}
		return maximum;
	}
	// This algorithm is working as per requirement. It's time complexity is high.
	public static int maxInLocalMins_2(int x, int[] arr) {
		int localMinimum = Integer.MAX_VALUE, maximum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - x + 1; i++) {
			localMinimum = Integer.MAX_VALUE;
			for (int j = i; j < i + x; j++) {
				if (arr[j] < localMinimum) {
					localMinimum = arr[j];
				}
			}
			if (localMinimum > maximum)
				maximum = localMinimum;
		}
		return maximum;
	}
}
