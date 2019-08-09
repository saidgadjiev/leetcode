package ru.saidgadjiev.leercode.easy._746;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minCostClimbingStairs() {
        int result = new Solution().minCostClimbingStairs(new int[] { 0, 0, 0, 1 });

        Assertions.assertEquals(0, result);
    }
}