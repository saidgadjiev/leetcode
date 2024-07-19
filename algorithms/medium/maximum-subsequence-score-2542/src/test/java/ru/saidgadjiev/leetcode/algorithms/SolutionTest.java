package ru.saidgadjiev.leetcode.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void maxScore() {
        Solution solution = new Solution();
        long maxScore = solution.maxScore(new int[]{1, 3, 3, 2}, new int[]{2, 1, 3, 4}, 3);
        Assertions.assertEquals(12, maxScore);
    }
}
