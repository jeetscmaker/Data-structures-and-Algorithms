package codeforces;

import java.util.Scanner;

/**
 * contest: Codeforces Round #650 (Div. 3), problem: (B) Even Array
 * System.out.flush() is mandatory because it is an interactive problem
 * which means  its output is transferred to the input of your solution,
 * and the output of your program is sent to interactor’s input.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            short n = sc.nextShort();
            int[] a = new int[n];
            short count_even = 0;
            short count_odd = 0;
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0 && a[j] % 2 != 0)
                    count_even++;
                if (j % 2 == 1 && a[j] % 2 != 1)
                    count_odd++;
            }
            if (count_even == count_odd) {
                System.out.println(count_even);
                System.out.flush();
            } else {
                System.out.println(-1);
                System.out.flush();
            }
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
