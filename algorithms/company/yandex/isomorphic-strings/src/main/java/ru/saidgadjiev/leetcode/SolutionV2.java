package ru.saidgadjiev.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SolutionV2 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> chatIndexS = new HashMap<>();
        Map<Character, Integer> charIndexT = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (!chatIndexS.containsKey(sChar)) {
                chatIndexS.put(sChar, i);
            }
            if (!charIndexT.containsKey(tChar)) {
                charIndexT.put(tChar, i);
            }

            if (!chatIndexS.get(sChar).equals(charIndexT.get(tChar))) {
                return false;
            }
        }

        return true;
    }
}
