package ru.saidgadjiev.leetcode.easy._190;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseBits() {
        int result = new Solution().reverseBits(3);

        Assertions.assertEquals(964176192, result);
    }
}