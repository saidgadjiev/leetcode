package ru.saidgadjiev.leetcode.algorithms._338;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[] ints = solution.countBits(2);

        Assertions.assertArrayEquals(new int[] {0, 1, 1}, ints);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int[] ints = solution.countBits(5);
        Assertions.assertArrayEquals(new int[] {0,1,1,2,1,2}, ints);
    }
}
