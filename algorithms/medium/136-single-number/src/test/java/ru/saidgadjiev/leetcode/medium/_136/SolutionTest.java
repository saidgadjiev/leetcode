package ru.saidgadjiev.leetcode.medium._136;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        int i = solution.singleNumber(new int[]{2, 2, 1});
        Assertions.assertEquals(1, i);
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        int i = solution.singleNumber(new int[]{4, 1, 2, 1, 2});
        Assertions.assertEquals(4, i);
    }
}