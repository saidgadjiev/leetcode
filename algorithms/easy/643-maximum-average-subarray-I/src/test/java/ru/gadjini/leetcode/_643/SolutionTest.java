package ru.gadjini.leetcode._643;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        double maxAverage = solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        Assertions.assertEquals(12.75000, maxAverage);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        double maxAverage = solution.findMaxAverage(new int[]{5}, 1);
        Assertions.assertEquals(5.0000, maxAverage);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        double maxAverage = solution.findMaxAverage(new int[]{0, 1, 1, 3, 3}, 4);
        Assertions.assertEquals(2.0000, maxAverage);
    }
}