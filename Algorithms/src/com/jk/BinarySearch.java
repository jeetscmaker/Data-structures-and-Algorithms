package com.jk;

public class BinarySearch {
	public static int binarySearch(int[] A, int data) {
		int low = 0, high = A.length - 1, mid;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (data == A[mid]) {
				return mid;
			} else if (data < A[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 12, 44, 67, 71 };
		int a = 65;
		System.out.println(binarySearch(arr, a)); // should print -1
		a = 67;
		System.out.println(binarySearch(arr, a)); // should print 5
		a = 12;
		System.out.println(binarySearch(arr, a)); // should print 3
	}
}
