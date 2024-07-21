package ru.saidgadjiev.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            List<Integer> combination = Arrays.asList(i);
            combinationSum3(k, n, combination, i, i, result);
        }

        return result;
    }

    public boolean combinationSum3(int k, int n, List<Integer> combination,
        int currentSum, int currentNumber, List<List<Integer>> result) {
        if (combination.size() == k && currentSum == n) {
            result.add(combination);
            return false;
        }
        if (combination.size() > k || currentSum > n) {
            return false;
        }
        if (currentNumber > 9) {
            return false;
        }
        for (int i = currentNumber + 1; i < 10; i++) {
            List<Integer> combinationCopy = new ArrayList<>(combination);
            combinationCopy.add(i);
            if (!combinationSum3(k, n, combinationCopy, currentSum + i, i, result)) {
               break;
            }
        }

        return true;
    }
}
