package ru.saidgadjiev.leetcode.easy._344;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/running-sum-of-1d-array
 */
public class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; ++i) {
            nums[i] = nums[i - 1] + nums[i];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] ints = new Solution().runningSum(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ints));
    }
}
