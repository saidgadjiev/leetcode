package ru.saidgadjiev.leetcode._424;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-repeating-character-replacement
 * AABBBBA 1
 * 4
 *
 * ABAB 2
 * 4 BBBB
 *
 *     A B A B P A A B A A B B
 *     A A A A P P P B B B B B
 * k - 2 1 1 0 2 1 0 2 1 0 0 0
 * l-  1 2 3 4 1 2 3 1 2 3 4 5
 * b - 4 4 5 3 3 5 5 5 4 3 2 1
 * map-A B A B P A
 *     1 1 2 2 1
 *
 * ABABP
 * BABP
 *
 * AZBOPB 2
 * 4 AZBBBB
 * 3 3 4 3 3 4
 *
 * AZBOPHB 2
 * 3 AAAOPHB
 *
 * ABABPAABAABB
 *
 * AAABBPQ
 * k = 0
 * A A
 * 0 0
 * 1 1
 * A A
 * 1 1
 */
public class Solution {

    public int characterReplacement(String s, int k) {
        int max = maxReplacement(s, k);
        String reverse = new StringBuilder(s).reverse().toString();
        int maxReverse = maxReplacement(reverse, k);

        return Math.max(maxReverse, max);
    }

    private int maxReplacement(String s, int k) {
        int kOperations = k;
        char firstChar = s.charAt(0);
        int i = 0;
        int j = 1;
        int maxLength = 0;
        int length = 1;
        Map<Character, Integer> charFrequences = new LinkedHashMap<>();
        charFrequences.put(s.charAt(0), 1);

        while (j < s.length()) {
            while (j < s.length() && (kOperations > 0 || s.charAt(i) == s.charAt(j))) {
                char nextChar = s.charAt(j++);
                charFrequences.put(nextChar, charFrequences.getOrDefault(nextChar, 0) + 1);
                if (nextChar != firstChar) {
                    --kOperations;
                }
                ++length;
            }
            charFrequences.put(firstChar, charFrequences.get(firstChar) - 1);
            maxLength = Math.max(maxLength, length);

            if (j < s.length()) {
                firstChar = s.charAt(++i);
                length = 0;

                if (k > 0) {
                    int subStrKOperations = 0;
                    for (Character character : charFrequences.keySet()) {
                        if (character != firstChar && charFrequences.get(character) > 0) {
                            subStrKOperations += charFrequences.get(character);
                        }
                    }

                    kOperations = k - subStrKOperations;
                    length = charFrequences.get(firstChar) + subStrKOperations;
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().characterReplacement("AAAB",0));
   }
}
