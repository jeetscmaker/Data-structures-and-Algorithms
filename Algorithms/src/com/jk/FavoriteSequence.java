package com.jk;


import java.util.Scanner;
public class FavoriteSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        int[] a;
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int l = 0, r = n - 1;
            boolean left = true;
            while (l <= r) {
                if (left)
                    System.out.print(a[l++] + " ");
                else
                    System.out.print(a[r--] + " ");
                left ^= true;
            }
            System.out.println();
        }
        sc.close();
    }
}
