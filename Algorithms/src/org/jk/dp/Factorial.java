package org.jk.dp;

import java.util.Scanner;

/**
 * Factorial of n is denoted by n! and is given by this formula: n! = n * (n-1)!
 * Factorial of 0 = 1.
 * Factorial of 1 = 1.
 * Factorial of 2 = 1*2.
 * Factorial of 3 = 1*2*3.
 * ......................
 * Factorial of n = 1*2*3*...*n
 */
public class Factorial {
    private static int[] fib;

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib = new int[n + 1];
        fib[0] = fib[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            fib[i] = i * fib[i - 1];
        }
        System.out.println("Factorial of " + n + " is " + fib[n]);
        sc.close();*/
        RecurSum recurSum = new RecurSum();
        System.out.println(recurSum.recurSum(1));
        System.out.println(recurSum.recurSum(2));
        System.out.println(recurSum.recurSum(3));
        System.out.println(recurSum.recurSum(4));
    }
}

/**
 * Suppose a recurrence is given by the following formula:
 * T(0) = T(1) = 2,
 * T(n) = SUM(2*T(i)*T(i-1)) for i = 1 to n-1 and n>1.
 * Convert above recurrence into program.
 */
// T(0) = 2, T(1) = 2
// T(2) =                                           2*T(1)*T(0)
// T(3) = 2*T(2)*T(1) + 2*T(1)*T(0)               = 2*T(2)*T(1) + T(2)
// T(4) = 2*T(3)*T(2) + 2*T(2)*T(1) + 2*T(1)*T(0) = 2*T(3)*T(2) + T(3)
// T(5) = 2*T(4)*T(3) + T(4)
//...............
// T(n) = 2*T(n-1)*T(n-2) + T(n-1)

class RecurSum {
    // Time complexity = O(n)
    public int recurSum(int n) {
        int sum = 0;
        int t0 = 2, t1 = 2;
        if (n == 0 || n == 1) return 2;
        for (int i = 2; i <= n; i++) {
            sum += 2 * t1 * t0;
            t0 = t1;
            t1 = sum;
        }
        return sum;
    }
}