package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[] thePrefixCommonArray = solution.findThePrefixCommonArray(new int[]{1, 3, 2, 4}, new int[]{3, 1, 2, 4});
        Assertions.assertArrayEquals(new int[]{0, 2, 3, 4}, thePrefixCommonArray);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int[] thePrefixCommonArray = solution.findThePrefixCommonArray(new int[]{2,3,1}, new int[]{3,1,2});
        Assertions.assertArrayEquals(new int[]{0,1,3}, thePrefixCommonArray);
    }
}
