package codeforces;

import java.util.Scanner;

/**
 * contest: Codeforces Round #728 (Div. 2), A. Pretty Permutations
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        for (int tt = 0; tt < t; tt++) {
            short n = sc.nextShort();
            if (n % 2 == 0) {
                for (int i = 1, j = 2; i < n && j <= n; i += 2, j += 2) {
                    System.out.print(j + " " + i + " ");
                }
                System.out.println();
            } else {
                System.out.print(3 + " " + 1 + " " + 2 + " ");
                for (int i = 4; i < n; i += 2) {
                    System.out.print((i + 1) + " " + (i) + " ");
                }
                System.out.println();
            }
        }
    }
}
