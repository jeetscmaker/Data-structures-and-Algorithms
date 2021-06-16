package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * contest: Codeforces Round #656 (Div. 3), problem: (B) Restore the Permutation by Merger.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 0; j < 2 * n; j++) {
                al.add(sc.nextInt());
            }
            ArrayList<Integer> res = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                Integer element = al.get(0);
                res.add(element);
                for (int k = 0; k < 2; k++) {
                    al.remove(element);
                }
            }
            for (int j = 0; j < res.size(); j++) {
                System.out.print(res.get(j) + " ");
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
