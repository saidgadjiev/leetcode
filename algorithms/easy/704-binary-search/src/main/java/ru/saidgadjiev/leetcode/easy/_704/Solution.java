package ru.saidgadjiev.leetcode.easy._704;

/**
 * https://leetcode.com/problems/binary-search/
 */
public class Solution {

    public int search(int[] nums, int target) {
        int leftBorder = 0;
        int rightBorder = nums.length - 1;

        while (leftBorder <= rightBorder){
            int mid = leftBorder + (rightBorder - leftBorder) / 2;
            if (nums[mid] > target) {
                rightBorder = mid - 1;
            } else if (nums[mid] < target) {
                leftBorder = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
