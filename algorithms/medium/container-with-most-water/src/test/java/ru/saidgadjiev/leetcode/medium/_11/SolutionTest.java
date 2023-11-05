package ru.saidgadjiev.leetcode.medium._11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        int result = new Solution().maxArea(new int[] { 1,1 });

        Assertions.assertEquals(1, result);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        Assertions.assertEquals(49, i);
    }
}