package ru.saidgadjiev.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        frequency.put(0, 1);

        int result = 0, prefixEnd = 0;
        for (int num : nums) {
            prefixEnd += num;
            int prefixStart = prefixEnd - k;

            if (frequency.containsKey(prefixStart)) {
                result += frequency.get(prefixStart);
            }

            frequency.put(prefixEnd, frequency.getOrDefault(prefixEnd, 0) + 1);
        }

        return result;
    }
}
