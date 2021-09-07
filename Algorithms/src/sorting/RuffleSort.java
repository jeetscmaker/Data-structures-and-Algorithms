package sorting;

import java.util.Arrays;
import java.util.Random;

public class RuffleSort {
    public static void ruffleSort(int[] a){
        Random r = new Random();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int oi = r.nextInt(i);
            int temp = a[i];
            a[i] = a[oi];
            a[oi] = temp;
        }
        Arrays.sort(a);
    }
}
