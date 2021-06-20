package codeforces;

import java.util.Scanner;
// contest: Codeforces Round #645 (Div. 2), problem: (A) Park Lighting
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        int n, m;
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            m = sc.nextInt();
            if (m % 2 == 0 || n % 2 == 0)
                System.out.println(m * n / 2);
            else
                System.out.println((m * n / 2) + 1);
        }
        sc.close();
    }
}
