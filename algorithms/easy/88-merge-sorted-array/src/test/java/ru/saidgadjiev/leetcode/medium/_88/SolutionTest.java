package ru.saidgadjiev.leetcode.medium._88;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        solution.merge(nums1, 3, new int[]{2, 5, 6}, 3);
        Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0, 0, 0};
        solution.merge(nums1, 3, new int[]{2, 5, 6, 8, 10}, 5);
        Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6, 8, 10}, nums1);
    }
}