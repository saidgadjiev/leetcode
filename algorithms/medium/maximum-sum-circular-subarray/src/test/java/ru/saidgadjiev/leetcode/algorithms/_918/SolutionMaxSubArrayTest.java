package ru.saidgadjiev.leetcode.algorithms._918;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionMaxSubArrayTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.maxSubarraySumCircular(new int[]{1, -2, 3, -2});

        Assertions.assertEquals(3, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.maxSubarraySumCircular(new int[]{5, 4, -1, 7, 8});
        Assertions.assertEquals(23, i);
    }
}
