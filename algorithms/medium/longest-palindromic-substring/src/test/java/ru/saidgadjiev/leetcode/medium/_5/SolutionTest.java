package ru.saidgadjiev.leetcode.medium._5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        String res = new Solution().longestPalindrome("cbbd");

        Assertions.assertEquals("bb", res);
    }

    @Test
    void case2() {
        String res = new Solution().longestPalindrome("babad");

        Assertions.assertEquals("aba", res);
    }
}