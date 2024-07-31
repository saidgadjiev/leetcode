package ru.saidgadjiev.leetcode.algorithms._714;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2);
        Assertions.assertEquals(8, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3);
        Assertions.assertEquals(6, i);
    }
}
