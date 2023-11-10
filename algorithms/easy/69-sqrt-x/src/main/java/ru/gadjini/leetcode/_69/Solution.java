package ru.gadjini.leetcode._69;

public class Solution {

    public int mySqrt(int x) {
        int l = 0; int r = x;

        while (l <= r) {
            long mid = l + (r - l) / 2;
            long multiply = mid * mid;
            if (multiply == x) {
                return (int) mid;
            } else if (multiply > x) {
                r = (int) (mid - 1);
            } else {
                l = (int) (mid + 1);
            }
        }

        //Because we need return nearest
        return l - 1;
    }
}
