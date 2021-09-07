package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        System.out.println(createPalindrome(5,2));
    }

    public static String createPalindrome(int N, int K) {
        if (N == 1) return "a";
        if (N == 2) return "aa";
        if (N == 3 && K == 1) return "aaa";
        if (N == 3 && K == 2) return "aba";
        // otherwise form a new palindrome.
        char[] ch = new char[26];
        char a = 97;
        for (int i = 0; i < 26; i++) {
            ch[i] = a++;
        }
        StringBuilder prefix = new StringBuilder();
        StringBuilder suffix = new StringBuilder();
        StringBuilder middle = new StringBuilder();

        for (int i = 0; i < K; i++) {
            prefix.append(ch[i]);
        }
        for (int i = 1; i <= N-2*K; i++) {
            middle.append('a');
        }
        for (int i = K-1; i >= 0; i--) {
            suffix.append(ch[i]);
        }
        return prefix.toString() + middle + suffix;
    }

    static void sort(int[] a) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i : a) l.add(i);
        Collections.sort(l);
        for (int i = 0; i < a.length; i++) a[i] = l.get(i);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }


}