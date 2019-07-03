package ru.saidgadjiev.leetcode.easy._448;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] exists = new boolean[nums.length + 1];

        for (int num: nums) {
            exists[num] = true;
        }
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < nums.length + 1; ++i) {
            if (!exists[i]) {
                result.add(i);
            }
        }

        return result;
    }
}
