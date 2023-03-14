package ru.saidgadjiev.leetcode.easy._692;

import java.util.*;

/**
 * https://leetcode.com/problems/top-k-frequent-words
 * ["i","love","leetcode","i","love","coding"], k = 2
 * ["i","love"]
 */
public class Solution {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> frequences = new HashMap<>();

        for (String word : words) {
            frequences.put(word, frequences.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> frequencesQueue = new PriorityQueue<>((o1, o2) -> {
            int result = o2.getValue().compareTo(o1.getValue());

            return result == 0 ? o1.getKey().compareTo(o2.getKey()) : result;
        });
        for (Map.Entry<String, Integer> entry : frequences.entrySet()) {
            frequencesQueue.offer(entry);
        }
        List<String> result = new ArrayList<>();
        while (k > 0) {
            result.add(frequencesQueue.poll().getKey());
            k--;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("i".compareTo("love"));
    }
}
