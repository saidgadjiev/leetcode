package ru.saidgadjiev.leetcode.easy._1679;

import java.util.*;

/**
 * https://leetcode.com/problems/max-number-of-k-sum-pairs
 */
public class Solution {

    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> visited = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            if (visited.containsKey(k - num)) {
                ++result;
                int frequency = visited.get(k - num);
                if (frequency == 0) {
                    visited.remove(k - num);
                } else {
                    visited.put(k - num, visited.get(k - num) - 1);
                }
            } else {
                visited.put(num, visited.getOrDefault(num, 0) + 1);
            }
        }

        return result;
    }
}
