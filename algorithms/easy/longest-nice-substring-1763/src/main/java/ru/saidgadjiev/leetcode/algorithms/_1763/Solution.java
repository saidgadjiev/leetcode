package ru.saidgadjiev.leetcode.algorithms._1763;

/**
 * https://leetcode.com/problems/longest-nice-substring/description/
 */
public class Solution {

    public String longestNiceSubstring(String s) {
        int[] longestCrossingSubstring = longestNiceSubstring(s, 0, s.length());

        return s.substring(longestCrossingSubstring[0], longestCrossingSubstring[1]);
    }

    private int[] longestNiceSubstring(String s, int low, int high) {
        String substring = s.substring(low, high);
        for (int i = low; i < high; ++i) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch) && substring.contains(Character.toLowerCase(ch) + "")) {
                continue;
            }
            if (Character.isLowerCase(ch) && substring.contains(Character.toUpperCase(ch) + "")) {
                continue;
            }

            int[] left = longestNiceSubstring(s, low, i);
            int[] right = longestNiceSubstring(s, i + 1, high);

            if (left[1] - left[0] >= right[1] - right[0]) {
                return left;
            } else {
                return right;
            }
        }

        return new int[]{low, high};
    }
}
