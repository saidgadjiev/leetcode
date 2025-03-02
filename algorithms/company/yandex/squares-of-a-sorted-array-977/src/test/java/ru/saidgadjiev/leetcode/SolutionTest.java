package ru.saidgadjiev.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[] ints = solution.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        Assertions.assertArrayEquals(new int[] {0,1,9,16,100}, ints);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int[] ints = solution.sortedSquares(new int[]{-7,-3,2,3,11});
        Assertions.assertArrayEquals(new int[] {4,9,9,49,121}, ints);
    }
}
