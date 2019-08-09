package ru.saidgadjiev.leetcode.medium._5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestPalindrome() {
        String res = new Solution().longestPalindrome("cbbd");

        Assertions.assertEquals(res, "aba");
    }
}