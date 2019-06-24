package ru.saidgadjiev.leetcode._28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void strStr() {
        int result = new Solution().strStr("mississippi", "pi");

        Assertions.assertEquals(result, 9);
    }
}