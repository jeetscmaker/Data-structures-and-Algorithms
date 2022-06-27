package codeforces;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (s.indexOf('r') < s.indexOf('R')
                    && s.indexOf('g') < s.indexOf('G')
                    && s.indexOf('b') < s.indexOf('B'))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}