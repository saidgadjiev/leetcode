package ru.saidgadjiev.leetcode.easy._202;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        Assertions.assertTrue(solution.isHappy(19));
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        Assertions.assertFalse(solution.isHappy(2));
    }
}