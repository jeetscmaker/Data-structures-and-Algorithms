package leetcode;

import java.util.Scanner;

/**
 * @author jeetscmaker
 * contest: Codeforces Round #301 (Div. 2), problem: (A) Combination Lock
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String originalState = sc.next();
        String password = sc.next();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = Math.abs((originalState.charAt(i) - '0') - (password.charAt(i) - '0'));
            int b = 10 - a;
            sum += Math.min(a, b);
        }
        System.out.println(sum);
        sc.close();
    }
}

