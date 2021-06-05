package codeforces;

import java.util.Scanner;

/**
 * contest: Codeforces Round #650 (Div. 3), problem: (A) Short Substrings
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s;
        for (int i = 0; i < t; i++) {
            s = sc.next();
            if (s.length() == 2) {
                System.out.println(s);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(s.charAt(0)));
                for (int j = 1; j < s.length(); j = j + 2) {
                    sb.append(s.charAt(j));
                }
                System.out.println(sb.toString());
            }
        }
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
