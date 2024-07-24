package ru.saidgadjiev.leetcode.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();

        int i = solution.numTilings(3);
        Assertions.assertEquals(5, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();

        int i = solution.numTilings(4);
        Assertions.assertEquals(11, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.numTilings(1);
        Assertions.assertEquals(1, i);
    }
}
