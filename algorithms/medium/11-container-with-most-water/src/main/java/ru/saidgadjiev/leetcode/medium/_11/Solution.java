package ru.saidgadjiev.leetcode.medium._11;

public class Solution {

    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int maxArea = Integer.MIN_VALUE;

        while (i < j) {
            int containerWidth = j - i;
            int containerHeight = Math.min(height[i], height[j]);
            int area = containerWidth * containerHeight;
            maxArea = Math.max(maxArea, area);

            if (height[i] < height[j]) {
                ++i;
            } else {
                --j;
            }
        }

        return maxArea;
    }
}
