package ru.saidgadjiev.leetcode.easy._746;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.minCostClimbingStairs(new int[]{10, 15, 20});
        Assertions.assertEquals(15, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1});
        Assertions.assertEquals(6, i);
    }
}