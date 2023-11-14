package ru.saidgadjiev.leetcode.easy._441;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.arrangeCoins(5);
        Assertions.assertEquals(2, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.arrangeCoins(8);
        Assertions.assertEquals(3, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.arrangeCoins(10);
        Assertions.assertEquals(4, i);
    }
}