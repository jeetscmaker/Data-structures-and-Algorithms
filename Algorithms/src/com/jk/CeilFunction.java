package com.jk;

/**
 * A book contains n pages. The page 1 always starts from the right(as seen from the front).
 * The last page is n. Then after turning 1 page we get page 2 and 3, then 4 and 5, so on.
 * Suppose we have been given page number p. The job is to find out how many pages needs to be turned
 * to reach page number n. We are allowed to start from the last page or the first page whichever is
 * nearest to p. So the smaller value should be returned.
 */
public class CeilFunction {
    public static void main(String[] args) {
        int p = pageCount(12, 4);
        System.out.println(p);
    }

    static int pageCount(int n, int p) {
        int f = 0, r = 0;
        double d1, d2;
        if (p == 1 || p == n)
            return 0;
        // suppose number of pages is even,
        if (n % 2 == 0) {
            f = ((p - 1) / 2);
            d1 = ((p - 1) * 1.0 / 2);
            f = f < d1 ? f + 1 : f;

            r = ((n - p) / 2);
            d2 = ((n - p) * 1.0 / 2);
            r = r < d2 ? r + 1 : r;

            return (f <= r ? f : r);
        }  // odd number of pages.
        else {
            f = ((p - 1) / 2);
            d1 = ((p - 1) * 1.0 / 2);
            f = f < d1 ? f + 1 : f;

            r = ((n - p) / 2);
            return (f <= r ? f : r);
        }
    }
}
