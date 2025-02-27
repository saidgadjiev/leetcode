package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[] in = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(in);

        Assertions.assertArrayEquals(new int[] {1,3,12,0,0}, in);
    }

    @Test
    void case2() {
        SolutionV2 solution = new SolutionV2();
        int[] in = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(in);

        Assertions.assertArrayEquals(new int[] {1,3,12,0,0}, in);
    }
}
