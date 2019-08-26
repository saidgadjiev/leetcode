package ru.saidgadjiev.leetcode.medium._516;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestPalindromeSubseq() {
        int result = new Solution().longestPalindromeSubseq("cbbd");

        Assertions.assertEquals(2, result);
    }
}