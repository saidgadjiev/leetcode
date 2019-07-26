package ru.idmt.saidgadjiev.leetcode.medium._91;

/**
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 *
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given a non-empty string containing only digits, determine the total number of ways to decode it.
 *
 * Example 1:
 *
 * Input: "12"
 * Output: 2
 * Explanation: It could be decoded as "AB" (1 2) or "L" (12).
 * Example 2:
 *
 * Input: "226"
 * Output: 3
 * Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
 */
public class Solution {

    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];

        dp[0] = 1;

        if (s.charAt(0) == '0') {
            return 0;
        } else {
            dp[1] = 1;
        }
        for (int i = 2; i <= s.length(); ++i) {
            char lastDigit = s.charAt(i - 1);
            char prevDigit = s.charAt(i - 2);
            int togetherDigit = Integer.valueOf("" + prevDigit + lastDigit);

            if (prevDigit > '2' && lastDigit == '0') {
                return 0;
            }
            if (lastDigit == '0' && prevDigit == '0') {
                return 0;
            }
            if (lastDigit == '0') {
                dp[i] = dp[i - 2];
            } else if (prevDigit == '0') {
                dp[i] = dp[i - 1];
            } else if (togetherDigit <= 26) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }

        return dp[s.length()];
    }
}
