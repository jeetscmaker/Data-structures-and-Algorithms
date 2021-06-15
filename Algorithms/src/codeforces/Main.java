package codeforces;

import java.util.Scanner;

/**
 * Codeforces Round #719 (Div. 3), problem: (A) Do Not Be Distracted!, Accepted
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean isStringOk = true;
            OUTER:
            for (int j = 0; j < n; j++) {
                char c = s.charAt(j);
                int k = s.lastIndexOf(c);
                for (int l = j; l <= k; l++) {
                    if (s.charAt(l) != c) {
                        isStringOk = false;
                        break OUTER;
                    }
                }
            }
            if (isStringOk)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }

    // n is not composite simply says that it must be a prime number
    private static boolean isPrime(int d) {
        for (int i = 2; i <= Math.sqrt(d); i++) {
            if (d % i == 0)
                return false;
        }
        return true;
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
