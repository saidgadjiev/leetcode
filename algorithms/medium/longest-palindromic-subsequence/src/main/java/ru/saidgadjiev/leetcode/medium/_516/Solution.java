package ru.saidgadjiev.leetcode.medium._516;

public class Solution {

    public int longestPalindromeSubseq(String s) {
        if (s.length() == 0) {
            return 0;
        }
        boolean[][] dp = new boolean[s.length()][s.length()];
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); ++i) {
            for (int j = i; j >= 0; --j) {
                boolean startEqEnd = s.charAt(j) == s.charAt(i);

                if (i == j) {
                    //If the same char: 'a' is palindrome
                    dp[i][j] = true;
                } else if (i - j == 1) {
                    //If length 2: 'ab' is palindrome when 'a' == 'b'
                    dp[i][j] = startEqEnd;
                } else if (startEqEnd && dp[i - 1][j + 1]) {
                    //Otherwise: string is palindrome if s(i) == s(j) and substring s(j + 1, i - 1) is palindrome
                    dp[i][j] = true;
                }

                if (dp[i][j] && i - j > end - start ) {
                    end = i;
                    start = j;
                }
            }
        }

        return end - start;
    }
}
