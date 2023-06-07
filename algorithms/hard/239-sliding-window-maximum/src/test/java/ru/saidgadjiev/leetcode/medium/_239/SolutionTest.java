package ru.saidgadjiev.leetcode.medium._239;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[] ints = solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        Assertions.assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, ints);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int[] ints = solution.maxSlidingWindow(new int[]{1}, 1);
        Assertions.assertArrayEquals(new int[]{1}, ints);
    }
}