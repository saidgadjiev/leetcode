package ru.saidgadjiev.leetcode.medium._70;

/**
 * https://leetcode.com/problems/climbing-stairs/
 * Что мы имеем:
 * - можем идти 1 ступеньку или 2
 *
 * Сколько уникальных путей достичь n?
 * 3
 * 1 1 1
 * 1 2
 * 2 1
 *
 * 10
 * 1 - 1(1)
 * 2 - 2((1,1),(2))
 * 3 - 3((1,1,1),(1,2),(2,1))
 * 4 - 5((1,1,1,1),(1,1,2),(2,1,1)(1,2,1)(2,2))
 * 5 -
 */
public class Solution {

    public int climbStairs(int n) {
        int[] dp = new int[Math.max(n, 2)];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i <n; ++i) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[n - 1];
    }
}
