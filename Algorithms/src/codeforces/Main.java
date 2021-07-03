package codeforces;

import java.util.Scanner;

// @author jeetscmaker
// contest: Codeforces Round #369 (Div. 2), problem: (A) Bus to Udayland
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] a = new char[n][5];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int j = 0;
            for (char c : s.toCharArray()) {
                a[i][j] = c;
                j++;
            }
        }
        boolean isAvailable = false;
        OUTER:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j = j + 3) {
                if (a[i][j] == 'O' && a[i][j + 1] == 'O') {
                    a[i][j] = '+';
                    a[i][j + 1] = '+';
                    isAvailable = true;
                    break OUTER;
                }

            }
        }
        if (isAvailable) {
            System.out.println("YES\n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }

        } else
            System.out.println("NO");
        sc.close();
    }
}