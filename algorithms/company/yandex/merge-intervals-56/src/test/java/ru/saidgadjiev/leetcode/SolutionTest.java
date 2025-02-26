package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[][] merge = solution.merge(new int[][]{
            {1, 3}, {2, 6}, {8, 10}, {15, 18}
        });

        Assertions.assertArrayEquals(merge[0], new int[]{1, 6});
        Assertions.assertArrayEquals(merge[1], new int[]{8, 10});
        Assertions.assertArrayEquals(merge[2], new int[]{15, 18});
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int[][] merge = solution.merge(new int[][]{
            {1, 4}, {4, 5}
        });

        Assertions.assertArrayEquals(merge[0], new int[]{1,5});
    }
}
