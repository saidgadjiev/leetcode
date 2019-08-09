package ru.saidgadjiev.leetcode.easy._231;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {

    @Test
    void isPowerOfTwo() {
        boolean result = new Solution().isPowerOfTwo(16);

        Assertions.assertTrue(result);

        result = new Solution().isPowerOfTwo(15);

        Assertions.assertFalse(result);
    }
}