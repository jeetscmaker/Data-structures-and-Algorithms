import java.util.ArrayList;

public class LongestCommonSubsequence {
    private static StringBuilder commonSubsequence = new StringBuilder();

    public static void main(String[] args) {
        String s1 = "sdbalhglkalvm jdfogidgajfdhguiadhgidfkahajnc;kuagfigfiuhadkblkdbwiygowdfgvlakb";
        String s2 = "jhdbvkjvkavfkjajkkjvglhgklahglbjgahgk;ahshgjygiahka;jhvkguyrkahkjalkhblublablkab";

        int n1 = s1.length();
        int n2 = s2.length();
        int[][] memo = new int[n1 + 1][n2 + 1];
        copy(memo, -1);
        System.out.println(new StringBuilder(s1).append(" has length: ").append(n1));
        System.out.println(new StringBuilder(s2).append(" has length: ").append(n2));
        System.out.println("Length of the longest common subsequence is: " + lcs_memoization(s1, s2, n1, n2, memo));
        System.out.println("Length of the longest common subsequence is: " + lcs_tabulation(s1, s2, n1, n2));
        System.out.println("The common subsequence is: " + commonSubsequence);
    }

    private static void copy(int[][] memo, int num) {
        for (int i = 0; i < memo.length; i++)
            for (int j = 0; j < memo[0].length; j++)
                memo[i][j] = num;
    }

    // Time complexity is 2^n, very high.
    private static int lcs_recursion(String s1, String s2, int n1, int n2) {
        if (n1 == 0 || n2 == 0)
            return 0;
        if (s1.charAt(n1 - 1) == s2.charAt(n2 - 1))
            return 1 + lcs_recursion(s1, s2, n1 - 1, n2 - 1);
        return Math.max(lcs_recursion(s1, s2, n1, n2 - 1), lcs_recursion(s1, s2, n1 - 1, n2));
    }

    private static int lcs_memoization(String s1, String s2, int n1, int n2, int[][] memo) {
        if (n1 == 0 || n2 == 0)
            memo[n1][n2] = 0;
        else if (memo[n1][n2] != -1)
            return memo[n1][n2];
        else if (s1.charAt(n1 - 1) == s2.charAt(n2 - 1))
            memo[n1][n2] = 1 + lcs_memoization(s1, s2, n1 - 1, n2 - 1, memo);
        else
            memo[n1][n2] = Math.max(lcs_memoization(s1, s2, n1, n2 - 1, memo), lcs_memoization(s1, s2, n1 - 1, n2, memo));
        return memo[n1][n2];
    }

    private static int lcs_tabulation(String s1, String s2, int n1, int n2) {
        int[][] t = new int[n1 + 1][n2 + 1];
        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n2; j++) {
                if (i == 0 || j == 0) t[i][j] = 0;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    t[i][j] = 1 + t[i - 1][j - 1];
                else
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
            }
        }
        ArrayList<Character> a = new ArrayList<>(n1 > n2 ? n1 : n2);
        int i = n1, j = n2;
        while (i > 0 && j > 0) {
            if (t[i][j] == t[i - 1][j])
                i--;
            else if (t[i][j] == t[i][j - 1])
                j--;
            else {
                a.add(s1.charAt(i - 1)); // actually s1.charAt(i-1) and s2.charAt(j-1) both are equal. We can use any.
                i--;
                j--;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int k = a.size() - 1; k >= 0; k--)
            result.append(a.get(k));
        commonSubsequence = result;
        return t[n1][n2];
    }
}
