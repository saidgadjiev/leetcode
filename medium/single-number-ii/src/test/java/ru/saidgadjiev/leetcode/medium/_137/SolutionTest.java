package ru.saidgadjiev.leetcode.medium._137;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void singleNumber() {
        int result = new Solution().singleNumber(new int[] { 2, 2, 3, 2 });

        Assertions.assertEquals(3, result);
    }
}