package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        boolean reflected = solution.isReflected(new int[][]{{1, 1}, {-1, 1}});

        Assertions.assertTrue(reflected);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        boolean reflected = solution.isReflected(new int[][]{{1, 1}, {-1, -1}});

        Assertions.assertFalse(reflected);
    }
}
