package ru.saidgadjiev.leetcode.algorithms._739;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/daily-temperatures
 */
public class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] existsTemperatures = new int[101];
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = temperatures.length - 1; i >= 0; --i) {
            existsTemperatures[temperatures[i]] = i;
            int warmerAfterXDays = Integer.MAX_VALUE;
            for (int j = temperatures[i] + 1; j <= 100; j++) {
                if (existsTemperatures[j] != 0) {
                    warmerAfterXDays = Math.min(warmerAfterXDays, existsTemperatures[j] - i);
                }
            }

            result.addFirst(warmerAfterXDays == Integer.MAX_VALUE ? 0 : warmerAfterXDays);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
