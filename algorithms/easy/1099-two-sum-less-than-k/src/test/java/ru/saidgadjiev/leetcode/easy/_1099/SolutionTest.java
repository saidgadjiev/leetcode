package ru.saidgadjiev.leetcode.easy._1099;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.twoSumLessThanK(new int[]{34, 23, 1, 24, 75, 33, 54, 8}, 60);
        Assertions.assertEquals(58, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.twoSumLessThanK(new int[]{10,20,30}, 15);
        Assertions.assertEquals(-1, i);
    }
}