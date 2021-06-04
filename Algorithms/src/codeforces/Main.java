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
        int x[] = new int[3];
        for (short i = 0, j = 0; i < 4; i++) {
            if (i != max_index) {
                x[j] = abcd[i];
                j++;
            }
        }
        int answer[] = new int[3];
        answer[0] = (x[0] - x[1] + x[2]) / 2;
        answer[1] = (x[0] + x[1] - x[2]) / 2;
        answer[2] = (x[1] - x[0] + x[2]) / 2;
        System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);
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
