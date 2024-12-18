package ru.saidgadjiev.leetcode.algorithms._918;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.maxSubarraySumCircular(new int[]{-3, -2, -3});
        Assertions.assertEquals(-2, i);
    }
}
