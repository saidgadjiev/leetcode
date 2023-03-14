package ru.saidgadjiev.leetcode.easy._438;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
 *
 *
 * baa
 * aa
 */
public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) {
            return List.of();
        }
        List<Integer> result = new ArrayList<>();
        int[] pFrequences = new int[26];
        for (char c : p.toCharArray()) {
            pFrequences[c - 'a'] += 1;
        }

        int[] frequences = new int[26];
        int left = 0;
        int sLength = s.length();

        for (int right = 0; right < sLength; right++) {
            char el = s.charAt(right);
            int index = el - 'a';
            frequences[index] += 1;
            if (!p.contains(el + "")) {
                left = right + 1;
                frequences = new int[26];
                continue;
            }
            if (frequences[index] > pFrequences[index]) {
                while (frequences[index] > pFrequences[index]) {
                    frequences[s.charAt(left) - 'a'] -= 1;
                    ++left;
                }
                continue;
            }

            if (right - left + 1 == p.length()) {
                result.add(left);
                frequences[s.charAt(left) - 'a'] -= 1;
                ++left;
            }
        }

        return result;
    }
}
