package ru.saidgadjiev.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        Map<Character, Integer> s1Permutation = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s1Permutation.put(s1.charAt(i), s1Permutation.getOrDefault(s1.charAt(i), 0) + 1);
        }

        Map<Character, Integer> s2Permutation = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s2Permutation.put(s2.charAt(i), s2Permutation.getOrDefault(s2.charAt(i), 0) + 1);
        }

        if (s1Permutation.equals(s2Permutation)) {
            return true;
        }

        int left = 0;
        for (int right = s1.length(); right < s2.length(); right++) {
            char rightChar = s2.charAt(right);
            s2Permutation.put(rightChar, s2Permutation.getOrDefault(rightChar, 0) + 1);

            char leftChar = s2.charAt(left);
            s2Permutation.put(leftChar, s2Permutation.get(leftChar) - 1);
            if (s2Permutation.get(leftChar) == 0) {
                s2Permutation.remove(leftChar);
            }
            ++left;

            if (s2Permutation.equals(s1Permutation)) {
                return true;
            }
        }

        return false;
    }
}
