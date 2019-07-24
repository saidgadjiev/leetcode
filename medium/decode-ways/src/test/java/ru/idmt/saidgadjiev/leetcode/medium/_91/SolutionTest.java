package ru.idmt.saidgadjiev.leetcode.medium._91;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numDecodings() {
        int result = new Solution().numDecodings("17");

        Assertions.assertEquals(2, result);
    }
}