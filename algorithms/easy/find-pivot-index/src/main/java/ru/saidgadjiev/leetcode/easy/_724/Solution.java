package ru.saidgadjiev.leetcode.easy._724;

/**
 * https://leetcode.com/problems/find-pivot-index/
 * [-1,-1,0,-1,-1,-1]
 * [-1,-2,-2,-3,-4,-5]
 * [-5,-4,-3,-3,-2,-1]
 * <p>
 * [1,7,3,6,5,6]
 * [1 ,  8, 11, 17, 22, 28]
 * [28, 27, 20, 17, 11, 6]
 */
public class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;
        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }
        if (rightSum == 0) {
            return 0;
        }

        int sum = 0;
        int[] leftSums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            leftSums[i] = nums[i] + sum;
            sum = leftSums[i];
        }
        int[] rightSums = new int[nums.length];
        sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            rightSums[i] = sum + nums[i];
            sum = rightSums[i];
        }

        for (int i = 0; i < nums.length - 2; i++) {
            if (leftSums[i] == rightSums[i + 2]) {
                return i + 1;
            }
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
        }
        if (leftSum == 0) {
            return nums.length - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}
