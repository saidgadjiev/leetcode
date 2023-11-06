package ru.gadjini.leetcode._1351;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.countNegatives(new int[][]{
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        });
        Assertions.assertEquals(8, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.countNegatives(new int[][]{
                {3, 2},
                {1, 0}
        });
        Assertions.assertEquals(0, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.countNegatives(new int[][]{
                {3, -1, -3, -3, -3}, {2, -2, -3, -3, -3}, {1, -2, -3, -3, -3}, {0, -3, -3, -3, -3}
        });
        Assertions.assertEquals(16, i);
    }
}