package problems;

/**
 * There are n-stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Count the number of ways,
 * the person can reach the top
 * n=1, there is only one way
 * n=2, There are two ways: (1, 1) and (2)
 * n = 3, 1,1,1   1,2   2,1
 * n = 4, there are 5 ways: (1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2)
 */

public class Nsteps {
    public static void main(String[] args) {
        System.out.println(calNumberOfWays_recursion(6));
        System.out.println(calNumberOfWays_dp(6));
    }
// Similar to fibonacci series recursion.
    public static int calNumberOfWays_recursion(int n){
        if(n ==1)
            return 1;
        if(n==2)
            return 2;
        else return calNumberOfWays_recursion(n-1) + calNumberOfWays_recursion(n-2);
    }

    public static int calNumberOfWays_dp(int n){
        int x = 1, y = 2, z = 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        for (int i = 2; i < n; i++) {
            z = x+y;
            x = y;
            y = z;
        }
        return z;
    }
}
