package ru.saidgadjiev.leetcode._7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverse() {
        int result = new Solution().reverse(1534236469);

        Assertions.assertEquals(result, 123);
    }
}