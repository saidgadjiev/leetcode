package ru.saidgadjiev.leetcode.medium._416;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        boolean b = solution.canPartition(new int[]{1, 5, 11, 5, 5, 5});
        Assertions.assertTrue(b);
    }

}