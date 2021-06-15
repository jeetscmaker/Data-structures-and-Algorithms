package codeforces;

import java.util.Scanner;

/**
 * Find the maximum sum of a contiguous subarray of size k in a given array
 * Input  : arr[] = {100, 200, 300, 400}, k = 2, Output : 700 {300,400}
 * Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4, Output : 39 {4, 2, 10, 23}
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0, max_sum = 0;
        // sum of first k elements
        for (int i = 0; i < k; ++i) {
            sum += a[i];
        }
        int start = 0;
        for (int i = k; i < n; ++i) {
            if (sum > max_sum) {
                max_sum = sum;
            }
            sum = sum - a[start] + a[i];
            start++;
        }
        if (sum > max_sum) {
            max_sum = sum;
        }
        System.out.println("Max sum is: " + max_sum);
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
