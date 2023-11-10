package ru.gadjini.leetcode._162;

/**
 * https://leetcode.com/problems/find-peak-element
 */
public class Solution {

    public int findPeakElement(int[] nums) {
        int l = 0; int r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[mid + 1]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return r;
    }
}
