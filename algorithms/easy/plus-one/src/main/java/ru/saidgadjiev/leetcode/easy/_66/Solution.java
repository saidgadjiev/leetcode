package ru.saidgadjiev.leetcode.easy._66;

public class Solution {

    public int[] plusOne(int[] digits) {
        int sum = digits[digits.length - 1] + 1;
        int inMind = 0;

        if (sum >= 10) {
            sum %= 10;
            ++inMind;
        }

        digits[digits.length - 1] = sum;

        for (int i = digits.length - 2; i >= 0 && inMind > 0; --i) {
            sum = digits[i] + inMind--;

            if (sum >= 10) {
                sum %= 10;
                ++inMind;
            }
            digits[i] = sum;
        }
        if (inMind > 0) {
            int[] result = new int[digits.length + 1];

            result[0] = 1;

            for (int i = 0; i < digits.length; ++i) {
                result[i + 1] = digits[i];
            }

            return result;
        }

        return digits;
    }
}
