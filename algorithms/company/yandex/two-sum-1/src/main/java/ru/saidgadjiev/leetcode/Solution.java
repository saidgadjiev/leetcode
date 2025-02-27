package ru.saidgadjiev.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (cache.containsKey(diff)) {
                return new int[]{cache.get(diff), i};
            }

            cache.put(nums[i], i);
        }

        throw new IllegalStateException();
    }
}
