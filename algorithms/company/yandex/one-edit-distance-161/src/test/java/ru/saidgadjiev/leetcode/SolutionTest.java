package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        boolean oneEditDistance = solution.isOneEditDistance("ab", "acb");

        Assertions.assertTrue(oneEditDistance);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        boolean oneEditDistance = solution.isOneEditDistance("ab", "ab");

        Assertions.assertFalse(oneEditDistance);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        boolean oneEditDistance = solution.isOneEditDistance("cab", "ad");
        Assertions.assertFalse(oneEditDistance);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        boolean oneEditDistance = solution.isOneEditDistance("1203", "1213");
        Assertions.assertTrue(oneEditDistance);
    }
}
