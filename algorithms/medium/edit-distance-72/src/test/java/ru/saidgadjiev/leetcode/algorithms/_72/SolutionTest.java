package ru.saidgadjiev.leetcode.algorithms._72;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.minDistance("horse", "ros");
        Assertions.assertEquals(3, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.minDistance("intention", "execution");
        Assertions.assertEquals(5, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.minDistance("", "");

        Assertions.assertEquals(0, i);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        int i = solution.minDistance("", "a");

        Assertions.assertEquals(1, i);
    }
}
