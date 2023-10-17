package ru.gadjini.leetcode._1071;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        String s = solution.gcdOfStrings("ABABAB", "ABAB");
        Assertions.assertEquals("AB", s);
    }
}