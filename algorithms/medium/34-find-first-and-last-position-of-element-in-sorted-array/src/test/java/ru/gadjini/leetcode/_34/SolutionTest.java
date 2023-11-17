package ru.gadjini.leetcode._34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[] ints = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        Assertions.assertArrayEquals(new int[] {3, 4}, ints);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int[] ints = solution.searchRange(new int[]{1}, 1);
        Assertions.assertArrayEquals(new int[] {1}, ints);
    }
}