package ru.saidgadjiev.leetcode.medium._516;

import java.io.File;

public class Solution {

    public int longestPalindromeSubseq(String str) {
        int[][] dp = new int[str.length()][str.length()];
        for (int i = str.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }

            File.separator
        }
        return dp[0][str.length() - 1];
    }
}
