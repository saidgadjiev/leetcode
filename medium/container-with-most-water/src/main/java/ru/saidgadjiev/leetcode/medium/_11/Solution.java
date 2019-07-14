package ru.saidgadjiev.leetcode.medium._11;

/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container and n is at least 2.
 *
 *
 *
 *
 *
 * The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 *
 *
 *
 * Example:
 *
 * Input: [1,8,6,2,5,4,8,3,7]
 * Output: 49
 *
 * 1 1 1 100 101 2
 */
public class Solution {

    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;

        while (i <= j) {
            int w = j - i;
            int h = Math.min(height[i], height[j]);

            if (w * h > max) {
                max = w * h;
            }
            if (height[i] < height[j]) {
                ++i;
            } else {
                --j;
            }
        }

        return max;
    }
}
