package leetcode;

public class ClimbingStairs_70 {
    public static void main(String[] args) {

//        git config --global user.name "John Doe"

        climbStairs(10);
        System.out.println("done");
    }
    public static int climbStairs(int n) {
        if (n==1) {
            return 1;
        }
        int[] dp = new int [n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp [i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
