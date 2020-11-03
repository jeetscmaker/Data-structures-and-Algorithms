package disjointset;

public class DisjointSet {
    public int[] s;
    public int size;

    public void makeSet(int size) {
        s = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            s[i] = i;
        }
    }

    public int find(int x) {
        if (!(x >= 0 && x < size))
            return Integer.MIN_VALUE;
        if (s[x] == x)
            return x;
        else
            return find(s[x]);
    }

    public void union(int root1, int root2) {
        if (s[root1] == s[root2])
            return;
        if (!((s[root1] >= 0 && s[root1] < size) && (s[root2] >= 0 && s[root2] < size)))
            return;
        s[root1] = root2;
    }
}
