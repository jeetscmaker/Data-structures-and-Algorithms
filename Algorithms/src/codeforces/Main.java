package codeforces;

import java.util.Scanner;

/**
 * contest: Codeforces Round #640 (Div. 4), problem: (A) Sum of Round Numbers
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            if (String.valueOf(n).length() == 4) {
                int a, b, c, d;
                d = n % 10;
                n = n / 10;
                c = n % 10;
                n = n / 10;
                b = n % 10;
                n = n / 10;
                a = n;
                print(a, b, c, d);
            } else if (String.valueOf(n).length() == 3) {
                int a, b, c;
                c = n % 10;
                n = n / 10;
                b = n % 10;
                n = n / 10;
                a = n;
                print(0, a, b, c);
            } else if (String.valueOf(n).length() == 2) {
                int a, b;
                b = n % 10;
                n = n / 10;
                a = n;
                print(0, 0, a, b);
            } else {
                if ((n >= 1 && n <= 9) || n == 10000)
                    System.out.println(1 + "\n" + n);
            }
            System.out.println();
        }
        sc.close();
    }

    private static void print(int a, int b, int c, int d) {
        int count = 0;
        if (a != 0) count++;
        if (b != 0) count++;
        if (c != 0) count++;
        if (d != 0) count++;
        System.out.println(count);
        if (a != 0)
            System.out.print(a * 1000 + " ");
        if (b != 0)
            System.out.print(b * 100 + " ");
        if (c != 0)
            System.out.print(c * 10 + " ");
        if (d != 0)
            System.out.print(d);
    }

    private static boolean is_not_divisible(int k, int l, int m, int n, int d) {
        if ((d % k != 0) && (d % l != 0) && (d % m != 0) && (d % n != 0))
            return true;
        else
            return false;
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
