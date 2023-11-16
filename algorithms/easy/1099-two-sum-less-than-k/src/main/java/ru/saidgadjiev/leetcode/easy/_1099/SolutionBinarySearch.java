package ru.saidgadjiev.leetcode.easy._1099;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum-less-than-k/
 */
public class SolutionBinarySearch {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int answer = -1;

        for (int i = 0; i < nums.length; i++) {
            int bSearchIndex = Arrays.binarySearch(nums, k - nums[i] - 1);
            int j = bSearchIndex >= 0 ? bSearchIndex : ~bSearchIndex;
            if (j == nums.length || nums[j] > k - nums[i] - 1) {
                j--;
            }
            if (j > i) {
                answer = Math.max(answer, nums[i] + nums[j]);
            }
        }

        return answer;
    }
}
