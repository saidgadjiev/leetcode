package ru.gadjini.leetcode._643;

/**
 * https://leetcode.com/problems/maximum-average-subarray-i
 *
 * 1,12,-5,-6,50,3
 *
 * 1 12 -5 -6
 * 12 -5 -6 50
 * -5 -6 50 3
 */
public class Solution {

    public double findMaxAverage(int[] nums, int k) {
        int length = nums.length;
        if (length < k) {
            return average(nums, 0, length);
        } else {
            int windowSum = sum(nums, 0, k);
            double maxAverage = average(nums, 0, k);

            for (int i = 1; i <= length - k; i++) {
                windowSum -= nums[i - 1];
                windowSum += nums[i + k - 1];

                double maxCandidate = (double) windowSum / k;

                maxAverage = Math.max(maxAverage, maxCandidate);
            }

            return maxAverage;
        }
    }

    private int sum(int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += nums[i];
        }

        return sum;
    }

    private double average(int[] nums, int start, int end) {
        int sum = sum(nums, start, end);

        return (double) sum / (end - start);
    }
}
