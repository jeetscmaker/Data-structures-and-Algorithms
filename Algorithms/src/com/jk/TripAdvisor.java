package com.jk;

import java.util.Arrays;

/**
 * Find the minimum number of the occurrences to complete a given total number of hours.
 * You can use any element of the array more than once. If it is not possible
 * to make that 'total_hours' from the given array elements, return -1.
 * For example: total_hours = 15, array = [1,3,6].
 * Now we can use 1 as many times to complete 15. So 1+1+...+1 = 15 but
 * returned count is 15. The best solution here is 6+6+3 = 15, so count = 3.
 */

//Note: Below solution is not a correct solution so far.
public class TripAdvisor {
    static int edge = 0;

    public static int tripAdvise(int[] arr, int total_hours) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int count = modulo(total_hours, arr, max);
        if (edge == -1)
            return edge;
        return count;
    }

    private static int modulo(int total_hours, int[] arr, int max) {
        int div, rem;
        div = total_hours / max;
        rem = total_hours % max;
        if (rem == 0)
            return div;
        else {
            int nextMax = nextMax(arr, rem);
            if (nextMax == -1) {
                edge = -1;
                return -1;
            }
            return div + modulo(rem, arr, nextMax);
        }
    }

    private static int nextMax(int[] arr, int rem) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] <= rem)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 8, 16};
        int total_hours = 33;
        System.out.println(tripAdvise(arr, total_hours));
    }
}
