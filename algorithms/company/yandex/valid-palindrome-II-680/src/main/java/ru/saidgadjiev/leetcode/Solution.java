package ru.saidgadjiev.leetcode;

/**
 * Смотрим палиндром или нет и если не полиндром исключаем один символ слева проверяем и если и так не получилось,
 * то исключаем один символ справа и проверяем
 * Условие left < right потому что сам с собой символ не надо сравнивать поэтому знак меньше подходит
 */
public class Solution {

    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            ++left;
            --right;
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            ++left;
            --right;
        }

        return true;
    }
}
