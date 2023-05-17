package ru.saidgadjiev.leetcode.medium._1584;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        int i = solution.minCostConnectPoints(new int[][]{
                {0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}
        });
        Assertions.assertEquals(20, i);
    }
}