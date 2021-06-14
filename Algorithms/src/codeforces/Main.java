package codeforces;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author jeetscmaker
 * contest: Codeforces Round #677 (Div. 3), problem: (A) Boring Apartments
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        for (int tt = 0; tt < t; tt++) {
            int n = sc.nextInt();
            HashMap<String, Integer> map = new HashMap<>();
            int count = 0;
            for (int i = 1; i <= 9; i++) {
                String s = "";
                for (int j = 1; j <= 4; j++) {
                    s = s + i;
                    count = count + s.length();
                    map.put(s, count);
                }
            }
            String num = String.valueOf(n);
            System.out.println(map.get(num));
        }
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
