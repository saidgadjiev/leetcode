package ru.gadjini.leetcode._347;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionV2Test {

    @Test
    void case1() {
        SolutionV2 solution = new SolutionV2();
        int[] ints = solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        Assertions.assertArrayEquals(new int[] {1, 2}, ints);
    }

    @Test
    void case2() {
        SolutionV2 solution = new SolutionV2();
        int[] ints = solution.topKFrequent(new int[]{1}, 1);
        Assertions.assertArrayEquals(new int[] {1}, ints);
    }
}