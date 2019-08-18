package ru.saidgadjiev.leetcode.easy._387;

public class Solution {

    public int firstUniqChar(String s) {
        int[] frequency = new int[256];

        for (char ch: s.toCharArray()) {
            ++frequency[ch];
        }

        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);

            if (frequency[ch] == 1) {
                return i;
            }
        }

        return -1;
    }
}
