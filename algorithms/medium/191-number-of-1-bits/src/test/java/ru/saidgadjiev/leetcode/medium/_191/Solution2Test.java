package ru.saidgadjiev.leetcode.medium._191;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2Test {

    @Test
    void case1() {
        Solution2 solution = new Solution2();
        int i = solution.hammingWeight(11);
        Assertions.assertEquals(3, i);
    }

    @Test
    void case2() {
        Solution2 solution = new Solution2();
        int i = solution.hammingWeight(128);
        Assertions.assertEquals(1, i);
    }
}
