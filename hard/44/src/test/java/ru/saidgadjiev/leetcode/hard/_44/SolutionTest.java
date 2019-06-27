package ru.saidgadjiev.leetcode.hard._44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isMatch() {
        boolean result = new Solution().isMatch("ahvghvhgvhgvhgvb", "a*b");

        Assertions.assertTrue(result);
    }
}