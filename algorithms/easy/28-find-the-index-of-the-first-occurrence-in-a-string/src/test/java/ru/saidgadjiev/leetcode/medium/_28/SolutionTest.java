package ru.saidgadjiev.leetcode.medium._28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        int i = solution.strStr("sadbutsad", "sad");
        Assertions.assertEquals(0, i);
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        int i = solution.strStr("leetcode", "leeto");
        Assertions.assertEquals(-1, i);
    }
}