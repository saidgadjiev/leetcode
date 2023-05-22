package ru.saidgadjiev.leetcode.medium._787;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int cheapestPrice = solution.findCheapestPrice(4, new int[][]{
                {0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}
        }, 0, 3, 1);
        Assertions.assertEquals(700, cheapestPrice);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int cheapestPrice = solution.findCheapestPrice(4, new int[][]{
                {0, 1, 100}
        }, 0, 1, 1);
        Assertions.assertEquals(100, cheapestPrice);
    }
}