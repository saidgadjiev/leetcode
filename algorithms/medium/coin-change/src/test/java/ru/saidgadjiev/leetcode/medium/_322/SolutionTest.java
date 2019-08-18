package ru.saidgadjiev.leetcode.medium._322;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void coinChange() {
        int result = new Solution().coinChange(new int[] { 1, 2, 5 }, 11);

        Assertions.assertEquals(3, result);
    }
}