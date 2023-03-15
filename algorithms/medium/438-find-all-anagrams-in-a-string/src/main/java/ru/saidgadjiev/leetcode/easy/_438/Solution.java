package ru.saidgadjiev.leetcode.easy._438;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-anagrams-in-a-string
 * cbaebabacd
 * abc
 * <p>
 * bba ebabacd
 * max 122
 * b bac babacd
 * max   211
 * <p>
 * left = 0;
 * right = 0;
 * <p>
 * p.contains(rigth++) ->
 * right - left == p.length() ->
 * saveResult(left)
 * left++
 * <p>
 * p.notContains(rigth++) ->
 * left++;
 * <p>
 * для определения уникальные ли символы в окне или нет сделать массив размера 26
 * в каждом окне считаем максимальное повторение и если таковых > 1 сдвигаемся влево вычитываем повторения
 * <p>
 * <p>
 * baa
 * aa
 */
public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        int sLength = s.length();
        int pLength = p.length();
        if (pLength > sLength) {
            return List.of();
        }
        int[] pFrequences = new int[26];
        int[] sFrequences = new int[26];
        for (int i = 0; i < pLength; i++) {
            pFrequences[p.charAt(i) - 'a']++;
            sFrequences[s.charAt(i) - 'a']++;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= sLength - pLength; i++) {
            if (equals(sFrequences, pFrequences)) {
                result.add(i);
            }
            sFrequences[s.charAt(i) - 'a']--;
            if (i + pLength < sLength) {
                sFrequences[s.charAt(i + pLength) - 'a']++;
            }
        }

        return result;
    }

    private boolean equals(int[] s, int[] p) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != p[i]) {
                return false;
            }
        }

        return true;
    }
}
