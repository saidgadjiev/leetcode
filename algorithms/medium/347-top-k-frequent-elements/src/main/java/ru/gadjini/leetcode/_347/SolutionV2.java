package ru.gadjini.leetcode._347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionV2 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        //O(n)
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        //O(n)
        for (int i = 0; i < nums.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        //O(n)
        for (Integer key : frequency.keySet()) {
            buckets[frequency.get(key)].add(key);
        }

        //O(n)
        List<Integer> frequencyOrder = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            frequencyOrder.addAll(buckets[i]);
        }

        //O(n)
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = frequencyOrder.get(i);
        }

        return result;
    }
}
