package ru.saidgadjiev.leetcode.medium._3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * bbbbb
 *
 *
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character, Integer> indexes = new HashMap<>();

        for (int j = 0, i = 0; j < s.length(); ++j) {
            if (indexes.containsKey(s.charAt(j))) {
                i = Math.max(indexes.get(s.charAt(j)), i);
            }

            max = Math.max(max, j - i + 1);
            indexes.put(s.charAt(j), j + 1);
        }

        return max;
    }
}
