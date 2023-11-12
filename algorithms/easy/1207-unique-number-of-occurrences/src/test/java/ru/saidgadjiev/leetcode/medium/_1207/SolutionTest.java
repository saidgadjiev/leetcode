package ru.saidgadjiev.leetcode.medium._1207;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        boolean b = solution.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3});
        Assertions.assertTrue(b);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        boolean b = solution.uniqueOccurrences(new int[]{1, 2});
        Assertions.assertFalse(b);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        boolean b = solution.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0});
        Assertions.assertTrue(b);
    }
}