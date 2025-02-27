package ru.saidgadjiev.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> replace = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);
            char sChar = s.charAt(i);

            if (replace.containsKey(tChar)) {
                if (sChar != replace.get(tChar)) {
                    return false;
                }
            } else if (replace.containsValue(sChar)) {
                return false;
            }
            replace.put(tChar, sChar);
        }

        return true;
    }
}
