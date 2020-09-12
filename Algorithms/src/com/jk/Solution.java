package com.jk;

import java.util.ArrayList;
import java.util.List;

/**
 * Count the number of times the lift stops. A[] is the array which contains the
 * weight of people. A[i] is the weight of ith person. B[] is the array which
 * tells on which floor a person has to go. B[i] indicates the floor on which
 * ith person wants to go. M is the last floor number. So the floors are 1,
 * 2,...,M. X is the maximum number of people allowed inside the lift. Y is the
 * maximum weight of people allowed inside the lift.
 * 
 * example: suppose 3 people with weights A=[40,60,45] kgs are in queue with
 * floors B=[3,3,5]. Y = 200kg(maximum total weight inside lift). X = 2, it
 * means maximum 2 people are allowed. So first two people (40kg, 60kg) will be
 * given a chance. Although lift can accomodate more weight(upto 200 kg) but
 * maximum 2 people are allowed at a time inside lift. So first lift will go to
 * 3rd floor, drop 40 & 60, then come back to 0(ground). Again it will take 45
 * kg person and drop to 5th floor and comes back to 0(ground). So the lift
 * stopped 4 times(3rd floor, ground floor, 5th floor, ground floor). So our
 * output is 4. Hence function should return 4.
 */
public class Solution {
	public static int m(int[] A, int[] B, int M, int X, int Y) {
		int N = A.length, totalPeople = 0, totalWeight = 0;
		int result = 0;
		List<Integer> list;
		for (int i = 0; i < N;) {
			totalPeople = 0;
			totalWeight = 0;
			list = new ArrayList<>();
			while (i < N && totalPeople < X && totalWeight + A[i] < Y) {
				totalPeople++;
				totalWeight += A[i];
				if (!list.contains(B[i]))
					list.add(B[i]);
				i++;
			} // while loop ends
			result += (list.size() + 1);
		} // for loop ends
		return result;
	}

	public static void main(String[] args) {
		int[] A = { 40, 80, 65, 50, 55, 68, 72, 71, 63, 81, 58 };
		int[] B = { 2, 3, 5, 6, 8, 2, 4, 5, 4, 3, 6 };
		int M = 10, X = 3, Y = 180;
		System.out.println("Total this much time the lift will stop: " + m(A, B, M, X, Y));
	}
}
