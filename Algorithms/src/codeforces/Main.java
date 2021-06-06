package codeforces;

import java.util.Scanner;

/**
 * contest: Codeforces Round #392 (Div. 2), problem: (A) Holiday Of Equality
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i] > max)
                max = a[i];
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (max - a[i]);
        }
        System.out.println(sum);
        sc.close();
    }

    // finding GCD of two numbers iteratively.
    public static int gcd(int a, int b) {
        int big = a > b ? a : b;
        int small = a < b ? a : b;
        int remainder = big % small;
        while (remainder != 0) {
            big = small;
            small = remainder;
            remainder = big % small;
        }
        return small;
    }

    public static int gcd_r(int a, int b) {
        return (b == 0 ? a : gcd_r(b, a % b));
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
