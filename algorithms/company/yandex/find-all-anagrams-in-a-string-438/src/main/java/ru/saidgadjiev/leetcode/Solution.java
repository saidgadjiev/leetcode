package ru.saidgadjiev.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) {
            return List.of();
        }
        List<Integer> result = new ArrayList<>();

        int[] freq = new int[26];
        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a']--;
            freq[s.charAt(i) - 'a']++;
        }

        if (isAllZeroes(freq)) {
            result.add(0);
        }
        int pLength = p.length();
        for (int i = pLength; i < s.length(); i++) {
            char leftChar = s.charAt(i - pLength);
            char rightChar = s.charAt(i);

            freq[rightChar - 'a']++;
            freq[leftChar - 'a']--;

            if (isAllZeroes(freq)) {
                result.add(i - pLength + 1);
            }
        }

        return result;
    }

    private boolean isAllZeroes(int[] arr) {
        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
