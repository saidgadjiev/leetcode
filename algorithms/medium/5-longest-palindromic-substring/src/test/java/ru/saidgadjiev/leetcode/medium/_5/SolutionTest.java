package ru.saidgadjiev.leetcode.medium._5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        String sol = solution.longestPalindrome("babad");
        Assertions.assertEquals("bab", sol);
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        String sol = solution.longestPalindrome("cbbd");
        Assertions.assertEquals("bb", sol);
    }

}