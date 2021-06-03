package codeforces;

import java.util.Scanner;

/**
 * Greatest Common Divisor of two numbers.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("GCD is: " + gcd(a,b));
        sc.close();
    }

    public static int gcd(int a, int b) {
        int big = a > b ? a : b;
        int small = a < b ? a : b;
        int remainder = big % small;;
        while (remainder != 0) {
            big = small;
            small = remainder;
            remainder = big % small;
        }
        return small;
    }
}
