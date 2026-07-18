package DP;

public class Min_Cost_Climbing_Stairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int[] dp = new int[n+1];

        dp[n] = 0;

        for(int i= n-1; i>=0; i--){
            dp[i] = cost[i] + Math.min(dp[i+1], dp[Math.min(i+2, n)]);
        }
        return Math.min(dp[0], dp[1]);
    }
}
