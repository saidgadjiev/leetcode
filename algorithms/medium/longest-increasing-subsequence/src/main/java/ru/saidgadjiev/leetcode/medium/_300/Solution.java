package ru.saidgadjiev.leetcode.medium._300;

import java.util.Arrays;

/**
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 *
 * Example:
 *
 * Input: [10,9,2,5,3,7,101,18]
 * Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 * Note:
 *
 * There may be more than one LIS combination, it is only necessary for you to return the length.
 * Your algorithm should run in O(n2) complexity.
 * Follow up: Could you improve it to O(n log n) time complexity?
 */
public class Solution {

    //TODO: optimize to n(logn)
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];

        Arrays.fill(dp, 1);
        for (int i = nums.length - 2; i >= 0; --i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[j] > nums[i]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                    } else {
                        break;
                    }
                }
            }
        }
        int max = 0;

        for (int value : dp) {
            if (max < value) {
                max = value;
            }
        }

        return max;
    }
}
