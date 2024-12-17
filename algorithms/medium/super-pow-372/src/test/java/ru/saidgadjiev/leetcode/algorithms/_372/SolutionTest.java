package ru.saidgadjiev.leetcode.algorithms._372;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.superPow(2, new int[]{1, 0});

        Assertions.assertEquals(1024, i);
    }
}
