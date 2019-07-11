package ru.saidgadjiev.leetcode.easy._461;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hammingDistance() {
        int result = new Solution().hammingDistance(1, 4);

        Assertions.assertEquals(2, result);
    }
}