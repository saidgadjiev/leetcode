package ru.saidgadjiev.leetcode.easy._205;

import java.util.*;
import java.util.function.IntConsumer;

/**
 * https://leetcode.com/problems/isomorphic-strings/
 */
public class Solution {

    public boolean isIsomorphic(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        }
        Map<Character, Character> sChar = new HashMap<>();
        Map<Character, Character> tChar = new HashMap<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            sChar.putIfAbsent(s.charAt(i), t.charAt(i));
            tChar.putIfAbsent(t.charAt(i), s.charAt(i));
            if (!sChar.get(s.charAt(i)).equals(t.charAt(i))
                    || !tChar.get(t.charAt(i)).equals(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("badc", "baba"));
    }
}
