package ru.saidgadjiev.leetcode.medium._5;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 * Input: s = "aacabdkacaa"
 * Output: "aca"
 */
public class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j >= 0; j--) {
                boolean startEqEnd = s.charAt(i) == s.charAt(j);

                if (i - j == 0 || i - j == 1) {
                    dp[i][j] = startEqEnd;
                } else if (startEqEnd && dp[i - 1][j + 1]) {
                    dp[i][j] = true;
                }

                if (dp[i][j] && i - j > end - start) {
                    end = i;
                    start = j;
                }
            }
        }

        return s.substring(start, end + 1);
    }
}
