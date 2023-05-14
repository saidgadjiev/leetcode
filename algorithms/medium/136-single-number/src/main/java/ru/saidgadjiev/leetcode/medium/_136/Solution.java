package ru.saidgadjiev.leetcode.medium._136;

/**
 * https://leetcode.com/problems/single-number
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int n = 0;

        for (int num : nums) {
            n ^= num;
        }

        return n;
    }
}
