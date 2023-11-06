package ru.gadjini.leetcode._1351;

/**
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 * [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
 */
public class Solution {

    public int countNegatives(int[][] grid) {
        int countNegatives = 0;
        for (int[] ints : grid) {
            int negativeIndex = findFirstNegativeIntegerIndex(ints);
            countNegatives += ints.length - negativeIndex;
        }

        return countNegatives;
    }

    private int findFirstNegativeIntegerIndex(int[] nums) {
        int i = 0; int j = nums.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] < 0) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return i;
    }
}
