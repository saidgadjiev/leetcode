package ru.saidgadjiev.leetcode.easy._392;

public class Solution {

    public boolean isSubsequence(String s, String t) {
        int j = 0;
        int i = 0;
        while(i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j++)) {
                i++;
            }
        }

        return i == s.length();
    }
}
