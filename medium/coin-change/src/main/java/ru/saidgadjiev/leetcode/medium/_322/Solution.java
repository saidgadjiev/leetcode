package ru.saidgadjiev.leetcode.medium._322;

public class Solution {

    public int coinChange(int[] coins, int amount) {
        return coinChange0(coins, amount, new int[amount]);
    }

    public int coinChange0(int[] coins, int amount, int[] dp) {
        if (amount == 0) {
            return 0;
        }
        if (dp[amount - 1] != 0) {
            return dp[amount - 1];
        }
        int min = Integer.MAX_VALUE;

        for (int coin: coins) {
            if (coin > amount) {
                continue;
            }
            int result = coinChange0(coins, amount - coin, dp);

            if (result >= 0 & result < min) {
                min = result + 1;
            }
        }
        dp[amount - 1] = min == Integer.MAX_VALUE ? - 1: min;

        return dp[amount - 1];
    }
}
