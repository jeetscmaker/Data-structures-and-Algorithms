package codeforces;

import java.util.Scanner;

/**
 * contest: Codeforces Round #375 (Div. 2), problem: (A) The New Year: Meeting Friends
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if((n/2) % 2 == 1)
            System.out.println("NO");
        else
            System.out.println("YES");
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
