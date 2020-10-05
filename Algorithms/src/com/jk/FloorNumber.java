package com.jk;

import java.util.Scanner;

public class FloorNumber {

	public static void main(String[] args) {
		int t, n, x;
		int result, div;
		double div1;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			x = sc.nextInt();
			if (n == 1 || n == 2)
				System.out.println(1);
			else {
				div = (n - 2) / x;
				div1 = (n - 2) * 1.0 / x;
				result = (div1 > div) ? div + 2 : div + 1;
				System.out.println(result);
			}
		}
		sc.close();
	}
}
