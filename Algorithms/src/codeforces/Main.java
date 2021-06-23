package codeforces;

import java.util.Scanner;

// contest: Codeforces Round #223 (Div. 2), problem: (A) Sereja and Dima
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i = 0, j = n - 1;
        int s_count = 0, d_count = 0;
        while (i < j) {
            // 4 1 2 10
            if (a[i] > a[j]) {
                s_count += a[i];
                i++;
            } else {
                s_count += a[j];
                j--;
            }
            // Dima's points calculation.
            if (a[i] > a[j]) {
                d_count += a[i];
                i++;
            } else {
                d_count += a[j];
                j--;
            }
        }
        if (n % 2 != 0) // n is odd number
        {
            // then i must be equal to j after the loop terminates. And every odd time it's Sereja's turn
            // to collect a point. Therefore s_count should be updated with the latest value of i or j.
            s_count += a[i];
        }
        System.out.println(s_count + " " + d_count);
        sc.close();
    }
}
