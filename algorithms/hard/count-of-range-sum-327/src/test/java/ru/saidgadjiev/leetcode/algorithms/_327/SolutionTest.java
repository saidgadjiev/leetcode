package ru.saidgadjiev.leetcode.algorithms._327;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.countRangeSum(new int[]{-2, 5, -1}, -2, 2);

        Assertions.assertEquals(3, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.countRangeSum(new int[]{0}, 0, 0);

        Assertions.assertEquals(1, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.countRangeSum(new int[]{0, -3, -3, 1, 1, 2}, 3, 5);

        Assertions.assertEquals(2, i);
    }
}
