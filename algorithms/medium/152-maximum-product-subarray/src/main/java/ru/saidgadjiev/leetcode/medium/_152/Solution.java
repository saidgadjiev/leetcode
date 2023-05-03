package ru.saidgadjiev.leetcode.medium._152;

/**
 * https://leetcode.com/problems/maximum-product-subarray/
 * 2, 3, -2, 4, -2, -4, 2,  2,   2
 * 2  6   6  6  96  96  128 256 512
 *
 * 2  6  -12 -48 96
 *
 *  2 = 2
 *
 *  2 3 = 6
 *    3 = 3
 *
 *  2 3 -2 = -12
 *    3 -2 = -6
 *      -2 = -2
 *
 *  2, 3, -2, 4 = -48
 *     3, -2, 4 = -24
 *        -2, 4 = -8
 *             4 = 4
 *
 * 2, 3, -2, 4, -2 = 96
 *    3, -2, 4, -2 = 48
 *       -2, 4, -2 = 16
 *           4, -2 = -8
 *              -2 = -2
 *
 */
public class Solution {

    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
            minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));

            maxSoFar = tempMax;
            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}
