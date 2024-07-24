package ru.saidgadjiev.leetcode.algorithms;

public class Solution {

    public int numTilings(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        long[] dp = new long[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;

        long[] dpa = new long[n + 1];
        dpa[2] = 1;

        int mod = 1_000_000_000 + 7;

        for (int i = 3; i < n + 1; ++i) {
            dp[i] = (2 * dpa[i - 1] + dp[i - 1] + dp[i - 2]) % mod;
            dpa[i] = (dpa[i - 1] + dp[i - 2]) % mod;
        }

        return (int) dp[n];
    }
}
