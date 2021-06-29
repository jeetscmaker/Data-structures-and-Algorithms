package codeforces;

import java.util.Scanner;

// contest: Codeforces Round #727 (Div. 2), problem: (B) Love Song, Accepted
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, q;
        n = sc.nextInt();
        q = sc.nextInt();
        String s = sc.next();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.charAt(i) - 96;
        }
        SegmentTree seg = new SegmentTree(0, n - 1, a);
        long sum = 0;
        for (int i = 0; i < q; i++) {
            int l, r;
            l = sc.nextInt();
            r = sc.nextInt();
            sum = seg.rangeSum(l - 1, r - 1);
            System.out.println(sum);
        }
        sc.close();
    }
}

class SegmentTree {
    int leftMost, rightMost;
    SegmentTree lChild, rChild;
    long sum; // for Range Sum Query.

    public SegmentTree(int leftMost, int rightMost, int[] a) {
        this.leftMost = leftMost;
        this.rightMost = rightMost;
        // for leaf
        if (leftMost == rightMost)
            sum = a[leftMost];
        else {
            int mid = (leftMost + rightMost) / 2;
            // creating left child and right child
            // lChild : [leftMost, mid] and rChild : [mid+1, rightMost]
            lChild = new SegmentTree(leftMost, mid, a);
            rChild = new SegmentTree(mid + 1, rightMost, a);
            // re-calculate the range sum.
            reCalc();
        }
    }

    public void reCalc() {
        if (leftMost == rightMost) return;
        sum = lChild.sum + rChild.sum;
    }

    public void pointUpdate(int index, int newValue) {
        if (leftMost == rightMost) {
            sum = newValue;
            return;
        }
        // two children
        if (index < lChild.rightMost) lChild.pointUpdate(index, newValue);
        else rChild.pointUpdate(index, newValue);
        // since an update happens, the range sum may also change.  So recalculate it.
        reCalc();
    }

    public long rangeSum(int l, int r) {
        // if the entirely disjoint set comes, that means if the given l is greater than the rightMost index of a
        // subtree, ignore that subtree. And vice versa.
        if (l > rightMost || r < leftMost) return 0;

        // If the given [l,r] entirely covers a subtree
        if (l <= leftMost && r >= rightMost) return sum;

        // else the [l,r] partially covers some subtree.
        return lChild.rangeSum(l, r) + rChild.rangeSum(l, r);
    }
}

