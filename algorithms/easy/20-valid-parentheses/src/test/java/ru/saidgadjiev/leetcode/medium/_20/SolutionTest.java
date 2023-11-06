package ru.saidgadjiev.leetcode.medium._20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        boolean valid = solution.isValid("()[]{}");
        Assertions.assertTrue(valid);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        boolean valid = solution.isValid("()");
        Assertions.assertTrue(valid);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        boolean valid = solution.isValid("(]");
        Assertions.assertFalse(valid);
    }
}