package ru.saidgadjiev.leetcode._28;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
public class Solution {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        } else if (haystack.length() == needle.length()) {
            for (int i = 0; i < needle.length(); ++i) {
                if (haystack.charAt(i) != needle.charAt(i)) {
                    return -1;
                }
            }

            return 0;
        } else {
            for (int i = 0; i <= haystack.length() - needle.length(); ++i) {
                boolean strStr = true;

                for (int j = 0; j < needle.length(); ++j) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        strStr = false;
                    }
                }

                if (strStr) {
                    return i;
                }
            }

            return -1;
        }
    }
}
