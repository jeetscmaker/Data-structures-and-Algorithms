package org.jk.dp;

import java.util.Scanner;

/** Factorial of n is denoted by n! and is given by this formula: n! = n * (n-1)!
 * Factorial of 0 = 1.
 * Factorial of 1 = 1.
 * Factorial of 2 = 1*2.
 * Factorial of 3 = 1*2*3.
 * ......................
 * Factorial of n = 1*2*3*...*n
 * */
public class Factorial {
    private static  int[] fib;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib = new int[n+1];
        fib[0] = fib[1] = 1;
        for (int i = 2; i < n+1; i++) {
            fib[i] = i * fib[i-1];
        }
        System.out.println("Factorial of " + n + " is " + fib[n]);
        sc.close();
    }
}
