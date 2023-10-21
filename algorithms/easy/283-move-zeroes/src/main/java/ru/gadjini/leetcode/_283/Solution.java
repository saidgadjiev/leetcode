package ru.gadjini.leetcode._283;

/**
 * https://leetcode.com/problems/move-zeroes/
 * 0,1,0,3,12
 *
 * 0,1
 *
 */
public class Solution {

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        int i = 0, j = 1;
        while (j < nums.length && i < nums.length) {
            if (nums[i] != 0) {
                ++i;
            } else if (nums[j] == 0 || j < i) {
                ++j;
            } else {
                swap(nums, i, j);
                ++i;
                ++j;
            }
        }
    }
}
