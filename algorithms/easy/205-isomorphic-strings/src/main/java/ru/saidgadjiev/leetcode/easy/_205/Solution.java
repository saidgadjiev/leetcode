package ru.saidgadjiev.leetcode.easy._205;

/**
 * https://leetcode.com/problems/isomorphic-strings/
 */
public class Solution {

    public boolean isIsomorphic(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        }
        char[] tChar = new char[256];
        char[] sChar = new char[256];
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (sChar[s.charAt(i)] == 0) {
                sChar[s.charAt(i)] = t.charAt(i);
            }
            if (tChar[t.charAt(i)] == 0) {
                tChar[t.charAt(i)] = s.charAt(i);
            }
            if (sChar[s.charAt(i)] != t.charAt(i)
                    || tChar[t.charAt(i)] != s.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("paper", "title"));
    }
}
