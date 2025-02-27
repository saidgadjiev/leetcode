package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[] ints = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assertions.assertArrayEquals(new int[] {0, 1}, ints);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int[] ints = solution.twoSum(new int[]{3, 2, 4}, 6);
        Assertions.assertArrayEquals(new int[] {1, 2}, ints);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int[] ints = solution.twoSum(new int[]{3, 3}, 6);
        Assertions.assertArrayEquals(new int[] {0, 1}, ints);
    }
}
