package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * contest: Codeforces Round #141 (Div. 2), problem: (A) Is your horseshoe on the other hoof?
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, l, m, n, d;
        int count = 0;
        k = sc.nextInt();
        l = sc.nextInt();
        m = sc.nextInt();
        n = sc.nextInt();
        Set<Integer> set = new HashSet<>(4);
        set.add(k);
        set.add(l);
        set.add(m);
        set.add(n);
        System.out.println(4 - set.size());
        sc.close();
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
