package ru.saidgadjiev.leetcode.easy._704;

import java.util.HashSet;
import java.util.Set;

/**
 * -10,-9,-8,-7,-6,-1,0,3,5,6,7,8,988,999,1000
 * 988
 * 7 - 15
 *
 */
public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int leftBorder = 0;
        int rightBorder = nums.length - 1;

        do {
            int mid = leftBorder + (rightBorder - leftBorder) / 2;
            if (nums[mid] > target) {
                rightBorder = mid - 1;
            } else if (nums[mid] < target) {
                leftBorder = mid;
            } else {
                return mid;
            }
        } while (leftBorder + 1 < rightBorder);

        if (leftBorder < nums.length - 1 && nums[leftBorder] == target) {
            return leftBorder;
        }
        if (rightBorder > 0 && nums[rightBorder] == target) {
            return rightBorder;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[] {5}, -5));
    }
}
