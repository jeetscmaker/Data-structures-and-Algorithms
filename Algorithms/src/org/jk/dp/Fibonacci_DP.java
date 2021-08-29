package org.jk.dp;

/**
 Fibonacci series using memoization.
 */
public class Fibonacci_DP {
    // it can store values upto n=100;
    static double[] store = new double[101];

    static {
        store[0] = 0;
        store[1] = 1;
    }

    public static void main(String[] args) {
        System.out.println((long)fib(50));
    }

    public static double fib(int n) {
        if (n == 1)
            return store[0];
        else if (n == 2)
            return store[1];
        else {
            for (int i = 2; i <=n ; i++) {
                store[i] = store[i - 1] + store[i - 2];
            }
        }
        return store[n];
    }
}