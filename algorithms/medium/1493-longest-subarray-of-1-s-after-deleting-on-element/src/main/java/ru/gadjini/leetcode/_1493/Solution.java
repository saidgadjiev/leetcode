package ru.gadjini.leetcode._1493;

public class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, k = 1;
        int right;
        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                --k;
            }
            if (k < 0) {
                k += 1 - nums[left];
                ++left;
            }
        }

        return right - left - 1;
    }
}
