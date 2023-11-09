package ru.saidgadjiev.leetcode.easy._875;

/**
 * https://leetcode.com/problems/koko-eating-bananas
 */
public class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1; int right = 1;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        while (left <= right) {
            int midSpeed = left + (right - left) / 2;
            int hToEat = 0;
            for (int pile : piles) {
                hToEat += Math.ceil((double) pile / midSpeed);
            }
            if (hToEat <= h) {
                right = midSpeed - 1;
            } else {
                left = midSpeed + 1;
            }
        }

        return left;
    }
}
