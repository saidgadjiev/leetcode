package ru.saidgadjiev.leetcode.easy._409;

import javax.swing.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/longest-palindrome/
 * bananas
 *
 */
public class Solution {
    public int longestPalindrome(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        int length = 0;
        for (Character character : count.keySet()) {
            Integer countChar = count.get(character);
            length += countChar / 2 * 2;

            if (length % 2 == 0 && countChar % 2 != 0) {
                ++length;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("baaaa"));
    }
}
