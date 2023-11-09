package ru.saidgadjiev.leetcode.easy._875;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.minEatingSpeed(new int[]{3, 6, 7, 11}, 8);
        Assertions.assertEquals(4, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5);
        Assertions.assertEquals(30, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.minEatingSpeed(new int[]{30,11,23,4,20}, 6);
        Assertions.assertEquals(23, i);
    }
}