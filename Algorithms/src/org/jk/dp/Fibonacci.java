package org.jk.dp;

import java.util.Scanner;

/**
 * Fibonacci series : 0 1 1 2 3 5 8 13 21...every element is the sum of the previous two.
 * We will use 'memoization' here.
 */

public class Fibonacci {
    public static void main(String[] args) {
        long x = 0, y = 1;
        long z = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) System.out.println(0);
        else if (n == 2) System.out.println(1);
        else {
            for (int i = 3; i <= n; i++) {
                z = x + y;
                x = y;
                y = z;
            }
            System.out.println("The number at " + n + " position of Fibonacci series is: " + z);
        }
        sc.close();
    }
}
