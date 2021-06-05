package codeforces;

import java.util.Scanner;

/**
 * contest: Codeforces Round #552 (Div. 3), problem: (A) Restoring Three Numbers.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int abcd[] = new int[4], max = 0, max_index = 0;
        for (short i = 0; i < 4; i++) {
            abcd[i] = sc.nextInt();
            if (max < abcd[i]) {
                max = abcd[i];
                max_index = i;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (i != max_index){
                System.out.print(max - abcd[i] + " ");
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
