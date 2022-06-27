package leetcode;

import java.util.Scanner;
import static java.lang.Math.*;
//import static java.lang.Math.min;
//import static java.lang.Math.max;
/**
 * @author jeetscmaker
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
        int MAX = 0, MIN = 101;
            int n = sc.nextInt();
            int[] a = new int[n];
            int min_index = 0, max_index = 0;
            for(int i = 0; i<n; i++){
                a[i] = sc.nextInt();
                if(a[i] < MIN){
                    MIN = a[i];
                    min_index = i;
                }
                if(a[i] > MAX){
                    MAX = a[i];
                    max_index = i;
                }
            }
            int min_left, min_right, max_left, max_right;
            min_left = min_index+1;
            max_left = max_index+1;
            min_right = n-min_index;
            max_right = n-max_index;
            int p = max(min_left, max_left);
            int q = min_left + max_right;
            int r = max(min_right, max_right);
            int s = min_right + max_left;

            int answer = min(min(min(p,q),r),s);
            System.out.println(answer);
        }
        sc.close();
    }
}

