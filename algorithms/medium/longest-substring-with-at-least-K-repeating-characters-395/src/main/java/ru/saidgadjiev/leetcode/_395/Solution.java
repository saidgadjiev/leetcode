package ru.saidgadjiev.leetcode._395;

/**
 * https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters
 */
public class Solution {

    public int longestSubstring(String s, int k) {
        return longestSubstring(s, 0, s.length(), k);
    }

    private int longestSubstring(String s, int low, int high, int k) {
        int[] freq = new int[256];

        for (int i = low; i < high; ++i) {
            freq[s.charAt(i)] += 1;
        }
        int result = Integer.MIN_VALUE;
        int leftI = -1;
        for (int i = low; i < high; ++i) {
            if (freq[s.charAt(i)] < k) {
                result = Math.max(longestSubstring(s, Math.max(leftI, low), i, k), result);
                leftI = i + 1;
            }
        }

        return result == Integer.MIN_VALUE ? high - low : Math.max(longestSubstring(s, leftI, high, k), result);
    }
}
