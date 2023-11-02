package ru.gadjini.leetcode._238;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[] ints = solution.productExceptSelf(new int[]{1, 2, 3, 4});
        Assertions.assertArrayEquals(new int[] {24,12,8,6}, ints);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int[] ints = solution.productExceptSelf(new int[]{-1,1,0,-3,3});
        Assertions.assertArrayEquals(new int[] {0,0,9,0,0}, ints);
    }
}