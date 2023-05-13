package ru.saidgadjiev.leetcode.medium._76;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * https://leetcode.com/problems/minimum-window-substring
 * ADOBECODEBANC ABC
 * BANC
 */
public class Solution {

    public String minWindow(String s, String t) {
        Map<Character, Integer> tFrequences = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFrequences.put(c, tFrequences.getOrDefault(c, 0) + 1);
        }

        int formedTChars = 0;
        Map<Character, Integer> currWindowFrequences = new HashMap<>();
        int r = 0;
        int l = 0;
        int[] ans = new int[]{-1, 0, 0};
        while (r < s.length()) {
            char ch = s.charAt(r);
            currWindowFrequences.put(ch, currWindowFrequences.getOrDefault(ch, 0) + 1);
            if (Objects.equals(currWindowFrequences.get(ch), tFrequences.get(ch))) {
                ++formedTChars;
            }
            while (l <= r && formedTChars == tFrequences.size()) {
                if (ans[0] == -1 || r - l < ans[0]) {
                    ans[0] = r - l;
                    ans[1] = l;
                    ans[2] = r;
                }
                char lCh = s.charAt(l);
                currWindowFrequences.put(lCh, currWindowFrequences.get(lCh) - 1);
                if (tFrequences.containsKey(lCh) &&
                        currWindowFrequences.get(lCh) < tFrequences.get(lCh)) {
                    --formedTChars;
                }
                ++l;
            }
            ++r;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}
