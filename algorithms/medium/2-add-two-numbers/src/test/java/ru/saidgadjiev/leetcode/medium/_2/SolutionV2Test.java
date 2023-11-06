package ru.saidgadjiev.leetcode.medium._2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionV2Test {

    @Test
    void case1() {
        SolutionV2 solution = new SolutionV2();
        int[] ints = solution.addTwoNumbers(new int[]{1, 2}, new int[]{1, 2, 5});
        Assertions.assertArrayEquals(new int[] {1, 3, 7}, ints);
    }
}