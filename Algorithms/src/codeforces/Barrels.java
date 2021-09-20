package codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// contest: Educational Codeforces Round 96 (Rated for Div. 2), problem: (B) Barrels
// Do NOT use Arrays.sort() because it causes TimeLimit Exceeded in many test cases on codeforces.

public class Barrels {
	public static long[] collections_sort(long[] a) {
		ArrayList<Long> al = new ArrayList<>();
		for(long n : a) al.add(n);
		Collections.sort(al);
		for(int i = 0; i < a.length; i++) a[i] = al.get(i);
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short t = sc.nextShort();
		while (t-- > 0) {
			int n, k;
			n = sc.nextInt();
			k = sc.nextInt();
			long[] a = new long[n];
			for(int i = 0; i<n; i++) {
				a[i] = sc.nextLong();
			}
			a = collections_sort(a);
			int j = n-2;
			long result = a[n-1];
			while(k-- > 0) {
				result += a[j];
				j--;
			}
			System.out.println(result);
		}
		sc.close();
	}
}
