package ru.gadjini.leetcode._1768;

/**
 * https://leetcode.com/problems/merge-strings-alternately/
 */
public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int it = 0;
        StringBuilder result = new StringBuilder();
        while (it < word1.length() && it < word2.length()) {
            result.append(word1.charAt(it)).append(word2.charAt(it));
            it++;
        }

        result.append(word1, it, word1.length()).append(word2, it, word2.length());

        return result.toString();
    }
}
