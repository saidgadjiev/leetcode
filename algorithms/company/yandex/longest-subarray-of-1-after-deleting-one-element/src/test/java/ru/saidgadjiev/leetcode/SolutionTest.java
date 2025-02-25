package ru.saidgadjiev.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.longestSubarray(new int[]{1, 1, 0, 1});

        Assertions.assertEquals(3, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1});

        Assertions.assertEquals(5, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.longestSubarray(new int[]{1, 1, 1});
        Assertions.assertEquals(2, i);
    }
}
