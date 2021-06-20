package codeforces;

import java.util.*;
//  contest: Codeforces Round #727 (Div. 2), problem: (B) Love Song, Time limit exceeded on test 4
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, q;
        n = sc.nextInt();
        q = sc.nextInt();
        String s = sc.next();
        char ch = 'a';
        int l, r;
        for (int i = 0; i < q; i++) {
            l = sc.nextInt();
            r = sc.nextInt();
            int length = 0;
            String s1 = s.substring(l - 1, r);
            for (char c : s1.toCharArray()) {
                length += c - ch + 1;
            }
            System.out.println(length);
        }
        sc.close();
    }
}
