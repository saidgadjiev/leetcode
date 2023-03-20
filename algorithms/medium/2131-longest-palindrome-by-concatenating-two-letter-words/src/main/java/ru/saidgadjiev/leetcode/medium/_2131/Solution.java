package ru.saidgadjiev.leetcode.medium._2131;

import java.util.*;

/**
 * https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words
 * lc cl gg
 * <p>
 * Что мы имеем:
 * У нас всегда будет длина четной так как слова по 2
 */
public class Solution {
    public int longestPalindrome(String[] words) {
        int result = 0;
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            String reverse = "" + word.charAt(1) + word.charAt(0);
            if (wordsMap.containsKey(reverse)) {
                result += 4;
                if (wordsMap.get(reverse) == 1) {
                    wordsMap.remove(reverse);
                } else {
                    wordsMap.put(reverse, wordsMap.get(reverse) - 1);
                }
            } else {
                wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
            }
        }
        for (int i = 0; i < 26; ++i) {
            char ch = (char) ('a' + i);
            if (wordsMap.keySet().stream().anyMatch(s -> s.equals("" + ch + ch ))) {
                result += 2;
                break;
            }
        }

        return result;
    }
}
