public class study_76 {
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int n = cost.length;
            int[] dp = new int[n + 1];
            //可以选择下标0或1作为初始阶梯
            dp[0] = dp[1] = 0;
            //从第2阶梯开始，可以从下标i-1花费cost[i-1]达到最小体力消耗
            //或者从下标i-2花费cost[i-2]达到最小体力消耗
            for (int i = 2; i <= n; i++) {
                dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
            }
            return dp[n];
        }
    }
}
