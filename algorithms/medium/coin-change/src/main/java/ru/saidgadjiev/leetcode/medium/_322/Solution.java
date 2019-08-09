package ru.saidgadjiev.leetcode.medium._322;

/**
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 *
 * Example 1:
 *
 * Input: coins = [1, 2, 5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 * Example 2:
 *
 * Input: coins = [2], amount = 3
 * Output: -1
 * Note:
 * You may assume that you have an infinite number of each kind of coin.
 */
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
