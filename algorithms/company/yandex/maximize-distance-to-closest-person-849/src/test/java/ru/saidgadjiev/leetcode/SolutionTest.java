package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1});

        Assertions.assertEquals(2, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.maxDistToClosest(new int[]{1, 0, 0, 0});

        Assertions.assertEquals(3, i);
    }
}
