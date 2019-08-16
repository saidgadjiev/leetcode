package ru.saidgadjiev.leetcode.medium._516;

/**
 * Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 * Input:
 *
 * "bbbab"
 * Output:
 * 4
 * One possible longest palindromic subsequence is "bbbb".
 * Example 2:
 * Input:
 *
 * "cbbd"
 * Output:
 * 2
 * One possible longest palindromic subsequence is "bb".
 */
public class Solution {

    public int longestPalindromeSubseq(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[][] dp = new int[s.length()][s.length()];

        for (int i = 0; i < s.length(); ++i) {
            for (int j = i; j >= 0; --j) {
                boolean startEqEnd = s.charAt(j) == s.charAt(i);

                if (i == j) {
                    dp[i][j] = 1;
                } else if (i - j == 1) {
                    dp[i][j] = startEqEnd ? 2 : 1;
                } else if (startEqEnd) {
                    dp[i][j] = 2 + dp[i - 1][j + 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i - 1][j]);
                }
            }
        }

        return dp[s.length() - 1][0];
    }
}
