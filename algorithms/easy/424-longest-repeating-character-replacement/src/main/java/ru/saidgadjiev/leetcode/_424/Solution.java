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
 * 0123456789
 * ABABPAABAABB
 * 1111
 *
 * A B A B P
 * 0 0 0 0 0
 * 0 1 2 3
 *
 * 3
 * 2 B B
 *
 * Идем по строке храним тот элемент который макисмально повторяется в текущем диапозано так как мы будем заменять все кроме него
 * Считаем количество замен и если их > k то нам надо двигаться левее на 1 так как в текущем диопазоне мы уже не может заменой получить все окно
 */
public class Solution {

    public int characterReplacement(String s, int k) {
        Map<Character, Integer> charFrequences = new LinkedHashMap<>();
        int left = 0;
        int maxLength = 0;
        int maxInCurrentWindow = 0;

        for (int right = 0; right < s.length(); right++) {
            charFrequences.put(s.charAt(right), charFrequences.getOrDefault(s.charAt(right), 0) + 1);
            maxInCurrentWindow = Math.max(maxInCurrentWindow, charFrequences.get(s.charAt(right)));

            if (right - left + 1 - maxInCurrentWindow > k) {
                charFrequences.put(s.charAt(left), charFrequences.get(s.charAt(left)) - 1);
                ++left;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().characterReplacement("BAAAB",2));
   }
}
