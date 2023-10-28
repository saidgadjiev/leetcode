package ru.gadjini.leetcode._1456;

import java.util.Set;

public class Solution {

    public int maxVowels(String s, int k) {
        int maxVowelsCount = 0;
        int currentVowelsCount = 0;
        for (int right = 0, left = 0; right < s.length(); right++) {
            if (isVowel(s.charAt(right))) {
                ++currentVowelsCount;
            }
            if ((right - left + 1) % k == 0) {
                maxVowelsCount = Math.max(maxVowelsCount, currentVowelsCount);
                if (isVowel(s.charAt(left))) {
                    --currentVowelsCount;
                }
                ++left;
            }
        }

        return maxVowelsCount;
    }

    private boolean isVowel(char ch) {
        return Set.of('a', 'e', 'i', 'o', 'u').contains(ch);
    }
}
