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
// SECOND APPROACH
public class Main {
    private static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        while(n>0){
            if(n >= 100){
                sum = sum + (n/100);
                n = n%100;
            }
            if(n >= 20){
                sum = sum + (n/20);
                n = n%20;
            }
            if(n >= 10){
                sum = sum + (n/10);
                n = n%10;
            }
            if(n >= 5){
                sum = sum + (n/5);
                n = n%5;
            }
            if(n >= 1) {
                sum = sum + n;
                break;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
