package ru.saidgadjiev.leetcode.algorithms._714;

public class Solution {

    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];

        dp[0][0] = 0;
        dp[0][1] = -prices[0] - fee;

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i] - fee);
        }

        return Math.max(dp[prices.length - 1][0], dp[prices.length - 1][1]);
    }
}
