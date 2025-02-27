package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        boolean b = solution.checkInclusion("ab", "eidbaooo");
        Assertions.assertTrue(b);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        boolean b = solution.checkInclusion("ab", "eidboaoo");
        Assertions.assertFalse(b);
    }
}
