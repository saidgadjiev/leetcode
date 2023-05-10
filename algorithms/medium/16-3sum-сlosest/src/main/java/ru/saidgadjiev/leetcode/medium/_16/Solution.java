package ru.saidgadjiev.leetcode.medium._16;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/3sum-closest/
 * -1, 2, 1, -4
 * 1
 * <p>
 * -1 2 1
 *
 * 15
 * -2
 * 17 = 15 - (-2)
 *
 * 15
 * 2
 * 13 = 15 - 2
 *
 * -15
 * 2
 * 17 = 2 - (-15)
 *
 * -15
 * -2
 * -13 = -15 - (-2)
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int sz = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < sz && diff != 0; ++i) {
            int lo = i + 1;
            int hi = sz - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }
                if (sum < target) {
                    ++lo;
                } else {
                    --hi;
                }
            }
        }
        return target - diff;
    }
}
