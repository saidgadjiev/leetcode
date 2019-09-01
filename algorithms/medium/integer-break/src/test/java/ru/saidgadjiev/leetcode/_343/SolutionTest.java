package ru.saidgadjiev.leetcode._343;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void integerBreak() {
        int maxProduct = new Solution().integerBreak(7);

        Assertions.assertEquals(6, maxProduct);
    }
}