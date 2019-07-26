package ru.saidgadjiev.leetcode.medium._935;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void knightDialer() {
        int result = new Solution().knightDialer(161);

        Assertions.assertEquals(20, result);
    }
}