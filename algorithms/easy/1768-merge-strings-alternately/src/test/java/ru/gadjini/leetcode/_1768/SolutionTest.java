package ru.gadjini.leetcode._1768;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        String s = solution.mergeAlternately("abc", "pqr");
        Assertions.assertEquals("apbqcr", s);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        String s = solution.mergeAlternately("ab", "pqrs");
        Assertions.assertEquals("apbqrs", s);
    }
}