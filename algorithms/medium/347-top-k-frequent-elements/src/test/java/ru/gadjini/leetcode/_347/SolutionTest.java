package ru.gadjini.leetcode._347;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[] ints = solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        Assertions.assertArrayEquals(new int[] {1, 2}, ints);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int[] ints = solution.topKFrequent(new int[]{1}, 1);
        Assertions.assertArrayEquals(new int[] {1}, ints);
    }
}