package ru.saidgadjiev.leetcode.algorithms._918;

/**
 * https://leetcode.com/problems/maximum-sum-circular-subarray/
 */
public class Solution {

    public int maxSubarraySumCircular(int[] nums) {
        SubarrayResult subarrayResult = maxSubarraySumCircular(nums, 0, nums.length - 1);
        SubarrayResult result = minSubarraySum(nums, 0, nums.length - 1);

        return subarrayResult.sum >= 0 ? Math.max(subarrayResult.sum, result.totalSum - result.sum)
            : subarrayResult.sum;
    }

    private SubarrayResult maxSubarraySumCircular(int[] nums, int low, int high) {
        if (low == high) {
            return new SubarrayResult(nums[low], nums[low], nums[low], nums[low]);
        }
        int mid = (low + high) / 2;
        SubarrayResult leftSubarrayResult = maxSubarraySumCircular(nums, low, mid);
        SubarrayResult rightSubarrayResult = maxSubarraySumCircular(nums, mid + 1, high);
        int crossMaxSum = leftSubarrayResult.sumSuffix + rightSubarrayResult.sumPrefix;

        return new SubarrayResult(
            Math.max(Math.max(leftSubarrayResult.sum, rightSubarrayResult.sum), crossMaxSum),
            Math.max(rightSubarrayResult.sumSuffix, rightSubarrayResult.totalSum + leftSubarrayResult.sumSuffix),
            Math.max(leftSubarrayResult.sumPrefix, leftSubarrayResult.totalSum + rightSubarrayResult.sumPrefix),
            leftSubarrayResult.totalSum + rightSubarrayResult.totalSum
        );
    }

    private SubarrayResult minSubarraySum(int[] nums, int low, int high) {
        if (low == high) {
            return new SubarrayResult(nums[low], nums[low], nums[low], nums[low]);
        }
        int mid = (low + high) / 2;
        SubarrayResult leftSubarrayResult = minSubarraySum(nums, low, mid);
        SubarrayResult rightSubarrayResult = minSubarraySum(nums, mid + 1, high);
        int crossMaxSum = leftSubarrayResult.sumSuffix + rightSubarrayResult.sumPrefix;

        return new SubarrayResult(
            Math.min(Math.min(leftSubarrayResult.sum, rightSubarrayResult.sum), crossMaxSum),
            Math.min(rightSubarrayResult.sumSuffix, rightSubarrayResult.totalSum + leftSubarrayResult.sumSuffix),
            Math.min(leftSubarrayResult.sumPrefix, leftSubarrayResult.totalSum + rightSubarrayResult.sumPrefix),
            leftSubarrayResult.totalSum + rightSubarrayResult.totalSum
        );
    }

    private static class SubarrayResult {

        private final int sum;

        private final int sumSuffix;

        private final int sumPrefix;

        private final int totalSum;

        private SubarrayResult(int sum, int sumSuffix, int sumPrefix, int totalSum) {
            this.sum = sum;
            this.sumSuffix = sumSuffix;
            this.sumPrefix = sumPrefix;
            this.totalSum = totalSum;
        }
    }
}
