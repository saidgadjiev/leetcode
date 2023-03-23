package ru.saidgadjiev.leetcode.medium._74;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchMatrix() {
        Solution solution = new Solution();
        boolean b = solution.searchMatrix(new int[][]{
                {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}
        }, 13);

        Assertions.assertTrue(b);
    }
}