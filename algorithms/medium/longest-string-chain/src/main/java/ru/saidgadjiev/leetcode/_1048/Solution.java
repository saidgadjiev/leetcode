package ru.saidgadjiev.leetcode._1048;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Given a list of words, each word consists of English lowercase letters.
 *
 * Let's say word1 is a predecessor of word2 if and only if we can add exactly one letter anywhere in word1 to make it equal to word2.  For example, "abc" is a predecessor of "abac".
 *
 * A word chain is a sequence of words [word_1, word_2, ..., word_k] with k >= 1, where word_1 is a predecessor of word_2, word_2 is a predecessor of word_3, and so on.
 *
 * Return the longest possible length of a word chain with words chosen from the given list of words.
 *
 *
 *
 * Example 1:
 *
 * Input: ["a","b","ba","bca","bda","bdca"]
 * Output: 4
 * Explanation: one of the longest word chain is "a","ba","bda","bdca".
 *
 *
 * Note:
 *
 * 1 <= words.length <= 1000
 * 1 <= words[i].length <= 16
 * words[i] only consists of English lowercase letters.
 */
public class Solution {

    public int longestStrChain(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        int max = -1;
        List<String> wordsSet = Arrays.asList(words);
        Map<String, Integer> dp = new HashMap<>();

        for (int i = words.length - 1; i >= 0; --i) {
            max = Math.max(max, longestStrChain(wordsSet, words[i], dp));
        }

        return max;
    }

    private int longestStrChain(List<String> words, String currWord, Map<String, Integer> dp) {
        if (!words.contains(currWord)) {
            return 0;
        }
        if (currWord.length() == 1) {
            dp.put(currWord, 1);

            return 1;
        }
        if (dp.containsKey(currWord)) {
            return dp.get(currWord);
        }
        int currWordLength = currWord.length();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < currWordLength; ++i) {
            String nextWord = new StringBuilder(currWord).deleteCharAt(i).toString();
            int result = longestStrChain(words, nextWord, dp);

            max = Math.max(max, result + 1);
        }
        dp.put(currWord, max == Integer.MIN_VALUE ? -1 : max);

        return dp.get(currWord);
    }
}
