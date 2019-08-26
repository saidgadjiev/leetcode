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
        int[] dp = new int[s.length()];

        for (int i = 0; i < s.length(); ++i) {
            dp[i] = 1;

            int pre = 0;

            for (int j = i - 1; j >= 0; --j) {
                boolean startEqEnd = s.charAt(i) == s.charAt(j);
                int tmp = dp[j];

                if (i - j == 1) {
                    dp[j] = startEqEnd ? 2 : 1;
                } else if (startEqEnd) {
                    dp[j] = 2 + pre;
                } else {
                    dp[j] = Math.max(dp[j], dp[j + 1]);
                }

                pre = tmp;
            }
        }

        return dp[0];
    }
}
