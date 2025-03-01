package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        boolean b = solution.validPalindrome("aba");

        Assertions.assertTrue(b);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        boolean b = solution.validPalindrome("abc");

        Assertions.assertFalse(b);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        boolean b = solution.validPalindrome("abca");

        Assertions.assertTrue(b);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        boolean b = solution.validPalindrome("deeee");

        Assertions.assertTrue(b);
    }
}
