package ru.saidgadjiev.leetcode.easy._704;

/**
 * https://leetcode.com/problems/binary-search/
 */
public class SolutionV2 {

    public int search(int[] nums, int target) {
        int leftBorder = 0;
        int rightBorder = nums.length - 1;

        while (leftBorder < rightBorder){
            int mid = leftBorder + (rightBorder - leftBorder) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                rightBorder = mid;
            } else {
                leftBorder = mid + 1;
            }
        }

        return -1;
    }
}
