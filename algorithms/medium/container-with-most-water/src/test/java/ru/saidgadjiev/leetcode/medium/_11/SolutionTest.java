package ru.saidgadjiev.leetcode.medium._11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxArea() {
        int result = new Solution().maxArea(new int[] { 1,1 });

        Assertions.assertEquals(1, result);
    }
}