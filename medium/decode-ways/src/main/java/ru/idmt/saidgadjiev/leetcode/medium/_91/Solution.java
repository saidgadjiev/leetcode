package ru.idmt.saidgadjiev.leetcode.medium._91;

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
