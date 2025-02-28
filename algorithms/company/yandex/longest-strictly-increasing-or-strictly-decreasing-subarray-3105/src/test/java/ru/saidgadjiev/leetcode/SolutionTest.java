package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.longestMonotonicSubarray(new int[]{1, 4, 3, 3, 2});
        Assertions.assertEquals(2, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.longestMonotonicSubarray(new int[]{3, 3, 3, 3});
        Assertions.assertEquals(1, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.longestMonotonicSubarray(new int[]{3,2,1});
        Assertions.assertEquals(3, i);
    }
}
