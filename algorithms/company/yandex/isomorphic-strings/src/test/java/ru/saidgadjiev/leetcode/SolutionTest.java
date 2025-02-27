package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        boolean isomorphic = solution.isIsomorphic("egg", "add");

        Assertions.assertTrue(isomorphic);
    }

    @Test
    void case2() {
        SolutionV2 solution = new SolutionV2();
        boolean isomorphic = solution.isIsomorphic("foo", "bar");
        Assertions.assertFalse(isomorphic);
    }
}
