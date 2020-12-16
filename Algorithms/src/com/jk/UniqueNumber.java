package com.jk;
/**
 * You are given a positive number x. Find the smallest positive integer number that has the sum of digits
 * equal to x and all digits are distinct (unique).
 * Input
 * The first line contains a single positive integer t (1≤t≤50) — the number of test cases in the test. Then t test cases follow.
 * <p>
 * Each test case consists of a single integer number x (1≤x≤50).
 * <p>
 * Output
 * Output t answers to the test cases:
 * <p>
 * if a positive integer number with the sum of digits equal to x and all digits are different exists,
 * print the smallest such number;
 * otherwise print -1.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, max = 9;
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            if (n > 45) {
                System.out.print(-1);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                while (n > 0) {
                    list.add(Math.min(max, n));
                    n -= n - max;
                    max--;
                }
                for (int j = list.size() - 1; j >= 0; j--) {
                    System.out.print(list.get(j));
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
