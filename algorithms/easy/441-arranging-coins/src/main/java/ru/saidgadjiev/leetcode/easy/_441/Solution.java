package ru.saidgadjiev.leetcode.easy._441;

/**
 * https://leetcode.com/problems/arranging-coins
 */
public class Solution {
    public int arrangeCoins(int n) {
        long l = 1; long r = (long) n + 1;
        while (l < r) {
            long mid = l + (r - l) / 2;
            long k = mid * (mid + 1) / 2;
            if (k == n) {
                return (int) mid;
            }
            if (k < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        //Не заполненный row
        return (int) l - 1;
    }
}
