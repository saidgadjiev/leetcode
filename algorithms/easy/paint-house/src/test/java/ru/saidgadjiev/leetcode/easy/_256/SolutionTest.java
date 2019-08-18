package ru.saidgadjiev.leetcode.easy._256;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minCost() {
        int minCost = new Solution().minCost(new int[][] {
                { 17, 2, 17 },
                { 16, 16, 5 },
                { 14, 3, 19 }
        });

        Assertions.assertEquals(10, minCost);
    }
}