package ru.saidgadjiev.leetcode.medium._139;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 *
 * Note:
 *
 * The same word in the dictionary may be reused multiple times in the segmentation.
 * You may assume the dictionary does not contain duplicate words.
 * Example 1:
 *
 * Input: s = "leetcode", wordDict = ["leet", "code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 * Example 2:
 *
 * Input: s = "applepenapple", wordDict = ["apple", "pen"]
 * Output: true
 * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
 *              Note that you are allowed to reuse a dictionary word.
 * Example 3:
 *
 * Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * Output: false
 *
 * cararab
 * "ca", "r", "rab", "ra"
 *
 * dp[0] = true
 * i = 2;j = 0;s = ca;dp[2] = true
 * i = 3;j = 2;s = r;dp[3] = true
 * i = 4;j = 2;s = ra;dp[4] = true
 * i = 5;j = 4;s = r;dp[5] = true
 * i = 6;j = 4;s = ra;dp[6] = true
 * i = 7;j = 4;s = rab;dp[7] = true
 */
public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];

        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;

                    break;
                }
            }
        }

        return dp[s.length()];
    }
}
