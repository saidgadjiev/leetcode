package ru.saidgadjiev.leetcode.medium._78;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 *
 * Note: The solution set must not contain duplicate subsets.
 *
 * Example:
 *
 * Input: nums = [1,2,3]
 * Output:
 * [
 *   [3],       0 0 1
 *   [1],       1 0 0
 *   [2],       0 1 0
 *   [1,2,3],   1 1 1
 *   [1,3],     1 0 1
 *   [2,3],     0 1 1
 *   [1,2],     0 0 1
 *   []         0 0 0
 * ]
 */
public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < 1 << nums.length; ++i) {
            List<Integer> subSet = new ArrayList<>();

            for (int b = 0; b < nums.length; ++b) {
                if (((i >> b) & 1) == 1) {
                    subSet.add(nums[b]);
                }
            }

            result.add(subSet);
        }

        return result;
    }
}
