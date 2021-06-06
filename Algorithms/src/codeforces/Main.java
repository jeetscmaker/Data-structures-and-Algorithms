package codeforces;

import java.util.Scanner;

/**
 * A run time comparison of gcd() and gcd_r().
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        long t1 = System.currentTimeMillis();
        System.out.println(gcd(n,m));
        long t2 = System.currentTimeMillis();
        System.out.println("without recursion, gcd() takes " + (t2-t1));
        System.out.println("========================================================");
        long t3 = System.currentTimeMillis();
        System.out.println(gcd_r(n,m));
        long t4 = System.currentTimeMillis();
        System.out.println("using recursion, gcd() takes " + (t4-t3));
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
