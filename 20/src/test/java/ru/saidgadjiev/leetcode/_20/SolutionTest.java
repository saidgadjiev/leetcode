package ru.saidgadjiev.leetcode._20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValid() {
        boolean result = new Solution().isValid("]");

        Assertions.assertFalse(result);
    }
}