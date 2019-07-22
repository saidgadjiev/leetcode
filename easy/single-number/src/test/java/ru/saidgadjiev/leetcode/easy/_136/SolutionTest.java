package ru.saidgadjiev.leetcode.easy._136;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void singleNumber() {
        int result = new Solution().singleNumber(new int[] { 2, 2, 1 });

        Assertions.assertEquals(1, result);
    }
}