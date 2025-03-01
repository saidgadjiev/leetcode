package ru.saidgadjiev.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        Map<Character, Integer> pCharFrequency = new HashMap<>();
        Map<Character, Integer> sCharFrequency = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            pCharFrequency.put(p.charAt(i), pCharFrequency.getOrDefault(p.charAt(i), 0) + 1);
            sCharFrequency.put(s.charAt(i), sCharFrequency.getOrDefault(s.charAt(i), 0) + 1);
        }

        if (pCharFrequency.equals(sCharFrequency)) {
            result.add(0);
        }
        int left = 0;
        for (int right = p.length(); right < s.length(); right++) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            sCharFrequency.put(rightChar, sCharFrequency.getOrDefault(rightChar, 0) + 1);
            sCharFrequency.put(leftChar, sCharFrequency.get(leftChar) - 1);
            if (sCharFrequency.get(leftChar) == 0) {
                sCharFrequency.remove(leftChar);
            }
            ++left;
            if (sCharFrequency.equals(pCharFrequency)) {
                result.add(left);
            }
        }

        return result;
    }
}
