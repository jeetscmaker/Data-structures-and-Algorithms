package codeforces;

import java.util.Scanner;
// contest: Codeforces Round #617 (Div. 3), problem: (A) Array with Odd Sum
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int evens = 0, odds = 0;
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                if (a[j] % 2 == 0)
                    evens++;
                else
                    odds++;
            }
            if (evens == n) {
                System.out.println("NO");
                continue;
            }
            if (odds == n && n % 2 == 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
