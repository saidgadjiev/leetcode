package ru.saidgadjiev.leetcode.medium._64;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minPathSum() {
        new Solution().minPathSum(new int[][]{
                {1, 2},
                {5, 6},
                {1, 1}
        });
    }
}