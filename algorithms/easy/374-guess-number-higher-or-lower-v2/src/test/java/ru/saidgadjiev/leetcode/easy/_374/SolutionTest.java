package ru.saidgadjiev.leetcode.easy._374;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.guessNumber(10);
        Assertions.assertEquals(5, i);
    }
}