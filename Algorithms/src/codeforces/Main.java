package codeforces;

import java.util.Scanner;
// contest: Codeforces Round #107 (Div. 2), problem: (A) Soft Drinking,
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // positive integers n, k, l, c, d, p, nl, np, not exceeding 1000 and no less than 1
        int n,k,l,c,d,p,nl,np;
        n = sc.nextInt();
        k = sc.nextInt();
        l = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        p = sc.nextInt();
        nl = sc.nextInt();
        np = sc.nextInt();

        int soft_drinks = (l*k)/nl;
        int lime_slices = c*d;
        int salt = p/np;
        System.out.println(Math.min(salt, Math.min(soft_drinks, lime_slices))/n);
        sc.close();
    }
}
