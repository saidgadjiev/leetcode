package ru.saidgadjiev.leetcode.easy._367;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        boolean perfectSquare = solution.isPerfectSquare(16);
        Assertions.assertTrue(perfectSquare);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        boolean perfectSquare = solution.isPerfectSquare(14);
        Assertions.assertFalse(perfectSquare);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        boolean perfectSquare = solution.isPerfectSquare(1);
        Assertions.assertTrue(perfectSquare);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        boolean perfectSquare = solution.isPerfectSquare(5);
        Assertions.assertFalse(perfectSquare);
    }

    @Test
    void case5() {
        Solution solution = new Solution();
        boolean perfectSquare = solution.isPerfectSquare(808201);
        Assertions.assertTrue(perfectSquare);
    }
}