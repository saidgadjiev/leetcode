package ru.saidgadjiev.leetcode.algorithms._327;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/count-of-range-sum/description/
 */
public class IncorrectSolution {

    private void build(int[] tree, int[] nums, int i, int l, int r) {
        if (l == r) {
            tree[i] = nums[l];
        } else {
            int mid = l + (r - l) / 2;

            build(tree, nums, 2 * i + 1, l, mid);
            build(tree, nums, 2 * i + 2, mid + 1, r);

            tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
        }
    }

    public int countRangeSum(int[] nums, int lower, int upper) {
        int[] tree = new int[nums.length * 4];

        Arrays.fill(tree, Integer.MIN_VALUE);

        build(tree, nums, 0, 0, nums.length - 1);

        int result = 0;

        for (int i : tree) {
            if (i >= lower && i <= upper) {
                ++result;
            }
        }

        return result;
    }
}
