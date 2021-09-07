package codeforces;
import java.util.*;

/**
 * @author jeetscmaker
 * contest: Educational Codeforces Round 104 (Div. 2), problem: (A) Arena
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr;
        while (t-- > 0) {
            int n = sc.nextInt();
            arr = new int[n];
            int smallest = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                smallest = arr[i] < smallest ? arr[i] : smallest;
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > smallest) count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}