package ru.gadjini.leetcode._69;

public class Solution {

    public int mySqrt(int x) {
        long l = 1; long r = (long) x + 1;

        while (l < r) {
            long mid = l + (r - l) / 2;
            double sqrt =  (double) x / mid;
            if (sqrt == mid) {
                return (int) mid;
            } else if (sqrt > mid) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        //Because we need return nearest
        return (int) l - 1;
    }
}
