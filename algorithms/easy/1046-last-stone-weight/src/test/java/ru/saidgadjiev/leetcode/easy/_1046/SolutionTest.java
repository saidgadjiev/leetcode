package ru.saidgadjiev.leetcode.easy._1046;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        Assertions.assertEquals(1, solution.lastStoneWeight(new int[] {2,7,4,1,8,1}));
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        Assertions.assertEquals(1, solution.lastStoneWeight(new int[] {1}));
    }
}