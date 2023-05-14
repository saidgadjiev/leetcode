package ru.saidgadjiev.leetcode.medium._547;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int circleNum = solution.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
        Assertions.assertEquals(2, circleNum);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int circleNum = solution.findCircleNum(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}});
        Assertions.assertEquals(3, circleNum);
    }
}