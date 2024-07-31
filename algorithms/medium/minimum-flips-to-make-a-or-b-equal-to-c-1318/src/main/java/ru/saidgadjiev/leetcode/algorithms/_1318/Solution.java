package ru.saidgadjiev.leetcode.algorithms._1318;

/**
 * https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c
 */
public class Solution {

    public int minFlips(int a, int b, int c) {
        int result = 0;

        while (c > 0 || a > 0 || b > 0) {
            if ((a & 1 | b & 1) != (c & 1)) {
                result += (c & 1) + (a & 1) + (b & 1);
            }
            c >>= 1;
            a >>= 1;
            b >>= 1;
        }

        return result;
    }
}
