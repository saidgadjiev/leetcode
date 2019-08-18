package ru.saidgadjiev.leetcode.medium._3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLongestSubstring() {
        int result = new Solution().lengthOfLongestSubstring("");

        Assertions.assertEquals(3, result);
    }
}