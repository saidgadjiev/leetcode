package ru.gadjini.leetcode._215;

/**
 * O(n + m)
 */
public class SolutionV2 {

    public int findKthLargest(int[] nums, int k) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        //O(n)
        for (int num: nums) {
            minValue = Math.min(minValue, num);
            maxValue = Math.max(maxValue, num);
        }

        //O(m)
        int[] count = new int[maxValue - minValue + 1];
        for (int num : nums) {
            count[num - minValue]++;
        }

        int remain = k;
        //O(m)
        for (int num = count.length - 1; num >= 0; num--) {
            remain -= count[num];

            if (remain <= 0) {
                return num + minValue;
            }
        }

        return -1;
    }
}
