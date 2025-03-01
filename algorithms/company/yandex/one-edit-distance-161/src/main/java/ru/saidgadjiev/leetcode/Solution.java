package ru.saidgadjiev.leetcode;

/**
 * Считаем количество одинаковых с начала и с конца
 * Если длина длинной строки отличается от количества одинаковых больше чем на 1 значит false
 */
public class Solution {

    public boolean isOneEditDistance(String s, String t) {
        int sLength = s.length(), tLength = t.length();
        int minStrLength = Math.min(sLength, tLength);
        int i = 0;
        while (i < minStrLength && s.charAt(i) == t.charAt(i)) {
            ++i;
        }
        int j = 0;
        while (j < minStrLength - i && s.charAt(sLength - 1 - j) == t.charAt(tLength - 1- j)) {
            ++j;
        }

        return sLength + tLength - minStrLength - 1 == i + j;
    }
}
