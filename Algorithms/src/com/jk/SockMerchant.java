package com.jk;

import java.util.*;

/**
 * John works at a clothing store. He has a large pile of socks that he must
 * pair by color for sale. Given an array of integers representing the color of
 * each sock, determine how many pairs of socks with matching colors there are.
 * For example, there are n=7 socks with colors ar=[1,2,1,2,1,3,2] . There is
 * one pair of color 1 and one of color 2. There are three odd socks left, one
 * of each color. The number of pairs is 2.
 */

public class SockMerchant {
	public static void main(String[] args) {
		// below array contains 2 pairs of 10, 1 pair of 20 and single 20, 30, 50. so
		// total 3 pairs. The output should be 3.
		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println(sockMerchant(9, ar));
	}

	static int sockMerchant(int n, int[] ar) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			if (map.containsKey(ar[i])) {
				map.put(ar[i], map.get(ar[i]) + 1);
			} else
				map.put(ar[i], 1);
		}
		int count = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			count += entry.getValue() / 2;
		}
		return count;
	}
}
