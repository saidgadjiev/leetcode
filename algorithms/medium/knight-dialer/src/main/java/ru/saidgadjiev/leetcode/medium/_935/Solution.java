package ru.saidgadjiev.leetcode.medium._935;

import java.util.Arrays;

/**
 * A chess knight can move as indicated in the chess diagram below:
 * <p>
 * .
 * <p>
 * <p>
 * <p>
 * This time, we place our chess knight on any numbered key of a phone pad (indicated above), and the knight makes N-1 hops.  Each hop must be from one key to another numbered key.
 * <p>
 * Each time it lands on a key (including the initial placement of the knight), it presses the number of that key, pressing N digits total.
 * <p>
 * How many distinct numbers can you dial in this manner?
 * <p>
 * Since the answer may be large, output the answer modulo 10^9 + 7.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: 10
 * Example 2:
 * <p>
 * Input: 2
 * Output: 20
 * Example 3:
 * <p>
 * Input: 3
 * Output: 46
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= N <= 5000
 * <p>
 * 0 1 2 3 4 5 6 7 8 9
 * 1 1 1 1 1 1 1 1 1 1
 * <p>
 * 2 2 2 2 3 0 3 2 2 2
 * <p>
 * 6 5 4 5 6 0 6 4 4 5
 */
public class Solution {
    private static final int[][] GRAPH = new int[][] {
            {4, 6, -1},
            {6, 2, -1},
            {1, 3, -1},
            {4, 2, -1},
            {3, 9, 0},
            {-1, -1, -1},
            {0, 7, 1},
            {8, 6, -1},
            {7, 9, -1},
            {8, 4, -1}
    };

    private static final int MOD = (int)1e9 + 7;

    public int knightDialer(int N) {
        long[] dp = new long[10];
        int sum = 10;

        Arrays.fill(dp, 1);

        dp[5] = 0;
        for (int i = 0; i < N - 1; ++i) {
            long[] prevDp = Arrays.copyOf(dp, dp.length);

            sum = 0;
            for (int j = 0; j < 10; ++j) {
                dp[j] = 0;
                for (int m : GRAPH[j]) {
                    if (m == -1) {
                        continue;
                    }
                    dp[j] += prevDp[m];
                    dp[j] %= MOD;
                }
                sum += dp[j];
                sum %= MOD;
            }
        }

        return sum;
    }
}
