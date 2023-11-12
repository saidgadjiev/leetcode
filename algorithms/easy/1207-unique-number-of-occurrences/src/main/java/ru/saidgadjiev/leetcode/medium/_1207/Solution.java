package ru.saidgadjiev.leetcode.medium._1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> unique = new HashSet<>();
        for (Integer value : map.values()) {
            if (!unique.add(value)) {
                return false;
            }
        }

        return true;
    }
}
