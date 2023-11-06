package ru.gadjini.leetcode._347;

import java.util.*;

public class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        //O(n)
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(frequency::get));

        //O(n log k)
        for (Integer key: frequency.keySet()) {
            queue.offer(key);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        //O(k log k)
        for (int i = 0; i < k; i++) {
            result.add(queue.poll());
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
