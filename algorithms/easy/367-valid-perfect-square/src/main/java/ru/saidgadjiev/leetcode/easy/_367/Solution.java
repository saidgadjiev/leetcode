package ru.saidgadjiev.leetcode.easy._367;

public class Solution {

    public boolean isPerfectSquare(int num) {
        int l = 1; int r = num + 1;

        while (l < r) {
            int mid = l + (r - l) / 2;
            double square = num / (double) mid;
            if (square == mid) {
                return true;
            }
            if (square > mid) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return false;
    }
}
