package ru.saidgadjiev.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (prev[1] >= intervals[i][0]) {
                prev[1] = Math.max(intervals[i][1], prev[1]);
            } else {
                merged.add(prev);
                prev = intervals[i];
            }
        }
        merged.add(prev);

        return merged.toArray(int[][]::new);
    }
}
