package ru.saidgadjiev.leetcode.easy._1099;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum-less-than-k/
 */
public class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        int answer = -1;

        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum < k) {
                answer = Math.max(sum, answer);
                ++l;
            } else {
                ++r;
            }
        }

        return answer;
    }
}
