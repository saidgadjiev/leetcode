package ru.saidgadjiev.leetcode.algorithms._452;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons
 */
public class Solution {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));

        int result = 0;
        int prevEnd = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > prevEnd) {
                prevEnd = points[i][1];
                ++result;
            }
        }

        return result + 1;
    }
}
