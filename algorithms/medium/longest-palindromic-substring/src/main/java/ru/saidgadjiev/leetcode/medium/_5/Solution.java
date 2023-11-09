package ru.saidgadjiev.leetcode.medium._5;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 *
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * [t, f, f, f, f]
 * [f, t, f, f, f]
 * [f, f, t, f, f]
 * [f, f, f, t, f]
 * [f, f, f, f, t]
 * i = startSubStringStr
 * j = endSubStringStr
 * [i + 1][j - 1] = innerSubStringStr
 * [i] == [j] && [i + 1][j - 1] = also palindrome
 *
 * Example 2:
 * Input: "cbbd"
 * Output: "bb"
 * https://leetcode.com/problems/longest-palindromic-substring
 */
public class Solution {

    public String longestPalindrome(String s) {
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        int[] ans = new int[] {0, 0};

        //One symbol substring = palindrome
        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }
        //Check two char substrings
        for (int i = 0; i < length - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                ans[0] = i; ans[1] = i + 1;
            }
        }
        //Check all other length substrings start from length 3 chars
        for (int diff = 2; diff < length; diff++) {
            for (int i = 0; i < length - diff; i++) {
                int j = i + diff;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    ans[0] = i; ans[1] = j;
                }
            }
        }

        return s.substring(ans[0], ans[1] + 1);
    }
}
