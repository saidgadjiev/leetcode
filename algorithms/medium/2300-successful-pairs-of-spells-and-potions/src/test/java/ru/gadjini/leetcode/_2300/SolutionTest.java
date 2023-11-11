package ru.gadjini.leetcode._2300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[] ints = solution.successfulPairs(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7);
        Assertions.assertArrayEquals(new int[] {4, 0, 3}, ints);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int[] ints = solution.successfulPairs(new int[]{3, 1, 2}, new int[]{8, 5, 8}, 16);
        Assertions.assertArrayEquals(new int[] {2, 0, 2}, ints);
    }
}