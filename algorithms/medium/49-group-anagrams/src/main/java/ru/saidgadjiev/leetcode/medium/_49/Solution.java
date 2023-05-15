package ru.saidgadjiev.leetcode.medium._49;

import java.util.*;

/**
 * https://leetcode.com/problems/group-anagrams
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> candidateGroups = new HashMap<>();
        Map<String, Map<Character, Integer>> keyWords = new HashMap<>();

        for (String str : strs) {
            boolean grouped = false;
            for (String s : candidateGroups.keySet()) {
                if (isAnagram(str, keyWords.get(s))) {
                    candidateGroups.get(s).add(str);
                    grouped = true;
                }
            }
            if (!grouped) {
                candidateGroups.put(str, new ArrayList<>());
                candidateGroups.get(str).add(str);
                Map<Character, Integer> frequency = frequency(str);
                keyWords.put(str, frequency);
            }
        }

        return new ArrayList<>(candidateGroups.values());
    }

    private Map<Character, Integer> frequency(String word) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : word.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        return frequency;
    }

    private boolean isAnagram(String candidateWord, Map<Character, Integer> keywords) {
        Map<Character, Integer> frequency = frequency(candidateWord);

        if (keywords.size() != frequency.size()) {
            return false;
        }

        for (Character character : frequency.keySet()) {
            if (!Objects.equals(frequency.get(character), keywords.get(character))) {
                return false;
            }
        }

        return true;
    }
}
