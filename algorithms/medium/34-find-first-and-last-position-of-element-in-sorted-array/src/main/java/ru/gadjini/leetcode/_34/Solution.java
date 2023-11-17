package ru.gadjini.leetcode._34;

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        if (l >= nums.length || nums[l] != target) {
            return new int[]{-1, -1};
        } else {
            int start = l;
            while (l < nums.length - 1 && nums[l + 1] == target) {
                l++;
            }

            return new int[]{start, l};
        }
    }
}
