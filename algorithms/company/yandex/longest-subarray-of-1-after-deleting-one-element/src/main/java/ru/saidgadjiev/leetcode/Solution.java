package ru.saidgadjiev.leetcode;

public class Solution {

    public int longestSubarray(int[] nums) {
        int zeroes = 0, left = 0, result = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes += 1;
            }

            while (zeroes > 1) {
                if (nums[left] == 0) {
                    zeroes -= 1;
                }

                ++left;
            }

            result = Math.max(result, i - left);
        }

        return result;
    }
}
