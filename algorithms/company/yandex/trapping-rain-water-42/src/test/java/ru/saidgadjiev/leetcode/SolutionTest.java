package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int trap = solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        Assertions.assertEquals(6, trap);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int trap = solution.trap(new int[]{4, 2, 0, 3, 2, 5});
        Assertions.assertEquals(9, trap);
    }
}
