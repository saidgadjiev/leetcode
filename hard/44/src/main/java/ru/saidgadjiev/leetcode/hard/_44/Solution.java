package ru.saidgadjiev.leetcode.hard._44;

/**
 * Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*'.
 *
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * The matching should cover the entire input string (not partial).
 *
 * Note:
 *
 * s could be empty and contains only lowercase letters a-z.
 * p could be empty and contains only lowercase letters a-z, and characters like ? or *.
 * Example 1:
 *
 * Input:
 * s = "aa"
 * p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 * Example 2:
 *
 * Input:
 * s = "aa"
 * p = "*"
 * Output: true
 * Explanation: '*' matches any sequence.
 * Example 3:
 *
 * Input:
 * s = "cb"
 * p = "?a"
 * Output: false
 * Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
 * Example 4:
 *
 * Input:
 * s = "adceb"
 * p = "*a*b"
 * Output: true
 * Explanation: The first '*' matches the empty sequence, while the second '*' matches the substring "dce".
 * Example 5:
 *
 * Input:
 * s = "acdcb"
 * p = "a*c?b"
 * Output: false
 */
public class Solution {

    public boolean isMatch(String s, String p) {
            // get length of String and wildcard pattern
            int n = s.length();
            int m = p.length();

            // create a DP lookup table
            boolean[][] T = new boolean[n+1][m+1];

            // if both pattern and String is empty : match
            T[0][0] = true;

            // handle empty String case (i == 0)
            for (int j = 1; j <= m; j++) {
                if (p.charAt(j - 1) == '*') {
                    T[0][j] = T[0][j - 1];
                }
            }

            // build matrix in bottom-up manner
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= m; j++)
                {
                    if (p.charAt(j-1) == '*') {
                        T[i][j] = T[i - 1][j] || T[i][j - 1];
                    }
                    else if (p.charAt(j-1) == '?' ||
                            s.charAt(i-1) == p.charAt(j-1)) {
                        T[i][j] = T[i - 1][j - 1];
                    }
                }
            }

            // last cell stores the answer
            return T[n][m];
        }
}
