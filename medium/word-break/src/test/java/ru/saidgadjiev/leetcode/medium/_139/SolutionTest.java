package ru.saidgadjiev.leetcode.medium._139;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void wordBreak() {
        boolean result = new Solution().wordBreak("cararab", Arrays.asList("ca", "r", "rab", "ra"));

        Assertions.assertTrue(result);
    }
}