package codeforces;

import java.util.Scanner;

/**
 * Allen has a LOT of money. He has n dollars in the bank. For security reasons, he wants to withdraw it in
 * cash (we will not disclose the reasons here). The denominations for dollar bills are 1, 5, 10, 20, 100.
 *
 * What is the minimum number of bills Allen could receive after withdrawing his entire balance?
 * Input
 * The first and only line of input contains a single integer n
 * (1<=n<=1000000000)).
 * Output the minimum number of bills that Allen could receive.
 */

public class Main {
    private static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(fun(n));
        sc.close();
    }

    private static int fun(int n) {
        if (n >= 100)
            return sum = sum + (n / 100) + fun(n % 100);
        else if (n >= 20)
            return sum = sum + (n / 20) + fun(n % 20);
        else if (n >= 10)
            return sum = sum + (n / 10) + fun(n % 10);
        else if (n >= 5)
            return sum = sum + (n / 5) + fun(n % 5);
        else if (n >= 1)
            return sum = sum + n;
        else
            return sum;
    }
}
