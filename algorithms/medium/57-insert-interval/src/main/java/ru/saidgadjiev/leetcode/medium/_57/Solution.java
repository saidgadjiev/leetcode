package ru.saidgadjiev.leetcode.medium._57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/insert-interval
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * Output: [[1,5],[6,9]]
 */
public class Solution {

    boolean doesIntervalsOverlap(int[] a, int[] b) {
        return Math.min(a[1], b[1]) - Math.max(a[0], b[0]) >= 0;
    }

    // Return the interval having all the elements of intervals a and b.
    int[] mergeIntervals(int[] a, int[] b) {
        int[] newInterval = {Math.min(a[0], b[0]), Math.max(a[1], b[1])};
        return newInterval;
    }

    // Insert the interval newInterval, into the list interval keeping the sorting order intact.
    int[][] insertInterval(int[][] intervals, int[] newInterval) {
        boolean isIntervalInserted = false;
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));

        for (int i = 0; i < intervals.length; i++) {
            if (newInterval[0] < intervals[i][0]) {
                // Found the position, insert the interval and break from the loop.
                list.add(i, newInterval);
                isIntervalInserted = true;
                break;
            }
        }

        // If there is no interval with a greater value of start value,
        // then the interval must be inserted at the end of the list.
        if (!isIntervalInserted) {
            list.add(newInterval);
        }

        return list.toArray(new int[list.size()][2]);
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        // Insert the interval first before merge processing.
        intervals = insertInterval(intervals, newInterval);

        List<int[]> answer = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] currInterval = {intervals[i][0], intervals[i][1]};
            // Merge until the list gets exhausted or no overlap is found.
            while (i < intervals.length && doesIntervalsOverlap(currInterval, intervals[i])) {
                currInterval = mergeIntervals(currInterval, intervals[i]);
                i++;
            }
            // Decrement to ensure we don't skip the interval due to outer for-loop incrementing.
            i--;
            answer.add(currInterval);
        }

        return answer.toArray(new int[answer.size()][2]);
    }
}
