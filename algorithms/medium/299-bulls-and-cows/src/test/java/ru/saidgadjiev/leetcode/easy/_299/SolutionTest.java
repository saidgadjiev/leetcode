package ru.saidgadjiev.leetcode.easy._299;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        String hint = solution.getHint("1807", "7810");
        Assertions.assertEquals("1A3B", hint);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        String hint = solution.getHint("0011", "1100");
        Assertions.assertEquals("1A1B", hint);
    }
}