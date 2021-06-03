package codeforces;

import java.util.Scanner;

/**
 * contest: Codeforces Round #377 (Div. 2), problem: (A) Buy a Shovel.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, r;
        k = sc.nextInt();
        r = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            if ((k * i) % 10 == r || (k * i) % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }

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

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
