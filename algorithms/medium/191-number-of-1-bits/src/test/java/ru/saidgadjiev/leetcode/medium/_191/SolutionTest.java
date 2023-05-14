package ru.saidgadjiev.leetcode.medium._191;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.hammingWeight(11);
        Assertions.assertEquals(3, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.hammingWeight(128);
        Assertions.assertEquals(1, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.hammingWeight(-3);
        Assertions.assertEquals(31, i);
    }
}