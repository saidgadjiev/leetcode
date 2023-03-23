package ru.saidgadjiev.leetcode.easy._704;

/**
 * -10,-9,-8,-7,-6,-1,0,3,5,6,7,8,988,999,1000
 * 988
 * 7 - 15
 *
 */
public class Solution {
    public int search(int[] nums, int target) {
        int leftBorder = 0;
        int rightBorder = nums.length - 1;

        while (leftBorder <= rightBorder){
            int mid = leftBorder + rightBorder / 2;
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

    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[] {5}, -5));
    }
}
