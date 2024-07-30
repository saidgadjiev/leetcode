package ru.saidgadjiev.leetcode.algorithms;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.longestCommonSubsequence("abcde", "ace");

        Assertions.assertEquals(3, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.longestCommonSubsequence("abc", "abc");
        Assertions.assertEquals(3, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.longestCommonSubsequence("abc", "def");
        Assertions.assertEquals(0, i);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        int i = solution.longestCommonSubsequence("bsbininm", "jmjkbkjkv");
        Assertions.assertEquals(1, i);
    }

    @Test
    void case5() {
        Solution solution = new Solution();

        int i = solution.longestCommonSubsequence("ezupkr", "ubmrapg");
        Assertions.assertEquals(2, i);
    }
}
