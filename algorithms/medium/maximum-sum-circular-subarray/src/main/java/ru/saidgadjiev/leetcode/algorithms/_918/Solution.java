package ru.saidgadjiev.leetcode.algorithms._918;

/**
 * https://leetcode.com/problems/maximum-sum-circular-subarray/
 */
public class Solution {

    public int maxSubarraySumCircular(int[] nums) {
        MaxSubarrayResult maxSubarrayResult = maxSubarraySumCircular(nums, 0, nums.length - 1);

        return maxSubarrayResult.maxSum;
    }

    private MaxSubarrayResult maxSubarraySumCircular(int[] nums, int low, int high) {
        if (low == high) {
            return new MaxSubarrayResult(nums[low], nums[low], nums[low], nums[low]);
        }
        int mid = (low + high) / 2;
        MaxSubarrayResult leftSubarrayResult = maxSubarraySumCircular(nums, low, mid);
        MaxSubarrayResult rightSubarrayResult = maxSubarraySumCircular(nums, mid + 1, high);
        int crossMaxSum = leftSubarrayResult.maxSumSuffix + rightSubarrayResult.maxSumPrefix;

        return new MaxSubarrayResult(
            Math.max(Math.max(leftSubarrayResult.maxSum, rightSubarrayResult.maxSum), crossMaxSum),
            Math.max(rightSubarrayResult.maxSumSuffix, rightSubarrayResult.totalSum + leftSubarrayResult.maxSumSuffix),
            Math.max(leftSubarrayResult.maxSumPrefix, leftSubarrayResult.totalSum + rightSubarrayResult.maxSumPrefix),
            leftSubarrayResult.totalSum + rightSubarrayResult.totalSum
        );
    }

    private static class MaxSubarrayResult {

        private final int maxSum;

        private final int maxSumSuffix;

        private final int maxSumPrefix;

        private final int totalSum;

        private MaxSubarrayResult(int sum, int maxSumSuffix, int maxSumPrefix, int totalSum) {
            this.maxSum = sum;
            this.maxSumSuffix = maxSumSuffix;
            this.maxSumPrefix = maxSumPrefix;
            this.totalSum = totalSum;
        }
    }
}
