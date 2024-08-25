package ru.saidgadjiev.leetcode.algorithms._739;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[] ints = solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});

        Assertions.assertArrayEquals(new int[] {1,1,4,2,1,1,0,0}, ints);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int[] ints = solution.dailyTemperatures(new int[]{30, 40, 50, 60});
        Assertions.assertArrayEquals(new int[] {1,1,1,0}, ints);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int[] ints = solution.dailyTemperatures(new int[]{30, 60, 90});
        Assertions.assertArrayEquals(new int[] {1, 1, 0}, ints);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        solution.dailyTemperatures(new int[] {89,62,70,58,47,47,46,76,100,70});
    }
}
