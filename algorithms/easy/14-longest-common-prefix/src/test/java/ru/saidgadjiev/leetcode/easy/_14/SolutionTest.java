package ru.saidgadjiev.leetcode.easy._14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        Assertions.assertEquals("fl", s);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[]{"dog","racecar","car"});
        Assertions.assertEquals("", s);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[]{"","s"});
        Assertions.assertEquals("", s);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[] {"aaa","aa","aaa"});
        Assertions.assertEquals("aa", s);
    }
}