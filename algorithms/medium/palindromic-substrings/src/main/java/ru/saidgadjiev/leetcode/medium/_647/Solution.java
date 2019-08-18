package ru.saidgadjiev.leetcode.medium._647;

/**
 * Given a string, your task is to count how many palindromic substrings in this string.
 *
 * The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.
 *
 * Example 1:
 *
 * Input: "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 *
 *
 * Example 2:
 *
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 *
 *
 * Note:
 *
 * The input string length won't exceed 1000.
 */
public class Solution {

    public int countSubstrings(String s) {
        if (s.length() == 0) {
            return 0;
        }
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;

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

                if (dp[i][j]) {
                    ++count;
                }
            }
        }

        return count;
    }
}
