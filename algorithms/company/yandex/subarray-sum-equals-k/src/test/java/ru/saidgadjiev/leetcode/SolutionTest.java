package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.subarraySum(new int[]{1, 1, 1}, 2);
        Assertions.assertEquals(2, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.subarraySum(new int[]{1, 2, 3}, 3);
        Assertions.assertEquals(2, i);
    }
}
