package ru.saidgadjiev.leetcode.algorithms._452;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int minArrowShots = solution.findMinArrowShots(new int[][]{
            {10, 16}, {2, 8}, {1, 6}, {7, 12}
        });

        Assertions.assertEquals(2, minArrowShots);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int minArrowShots = solution.findMinArrowShots(new int[][]{
            {1, 2}, {3, 4}, {5, 6}, {7, 8}
        });
        Assertions.assertEquals(4, minArrowShots);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int minArrowShots = solution.findMinArrowShots(new int[][]{
            {1, 2}, {2, 3}, {3, 4}, {4, 5}
        });
        Assertions.assertEquals(2, minArrowShots);
    }
}
