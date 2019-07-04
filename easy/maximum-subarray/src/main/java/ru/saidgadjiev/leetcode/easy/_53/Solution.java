package ru.saidgadjiev.leetcode.easy._53;

public class Solution {

    public int maxSubArray(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; ++i) {
            int sum = nums[i];

            if (sum > max) {
                max = sum;
            }
            for (int j = i - 1; j >= 0; --j) {
                sum += nums[j];

                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }
}
