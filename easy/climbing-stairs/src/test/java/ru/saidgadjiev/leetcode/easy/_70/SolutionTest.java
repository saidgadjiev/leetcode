package ru.saidgadjiev.leetcode.easy._70;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void climbStairs() {
        int result = new Solution().climbStairs(2);

        Assertions.assertEquals(result, 2);
    }
}