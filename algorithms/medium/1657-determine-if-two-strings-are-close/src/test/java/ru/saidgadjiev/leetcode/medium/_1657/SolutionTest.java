package ru.saidgadjiev.leetcode.medium._1657;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        boolean b = solution.closeStrings("abc", "bca");
        Assertions.assertTrue(b);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        boolean b = solution.closeStrings("a", "aa");
        Assertions.assertTrue(b);
    }
}