package ru.gadjini.leetcode._69;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.mySqrt(4);
        Assertions.assertEquals(2, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.mySqrt(8);
        Assertions.assertEquals(2, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.mySqrt(1);
        Assertions.assertEquals(1, i);
    }
}