package ru.saidgadjiev.leetcode.easy.house.robber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rob() {
        int result = new Solution().rob(new int[] { 1, 2, 3, 1 });

        Assertions.assertEquals(12, result);
    }
}