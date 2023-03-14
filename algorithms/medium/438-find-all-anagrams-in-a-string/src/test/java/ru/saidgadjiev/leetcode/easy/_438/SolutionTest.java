package ru.saidgadjiev.leetcode.easy._438;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        Assertions.assertEquals(List.of(0, 6), solution.findAnagrams("cbaebabacd", "abc"));
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        Assertions.assertEquals(List.of(0, 1, 2), solution.findAnagrams("abab", "ab"));
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        Assertions.assertEquals(List.of(1), solution.findAnagrams("baa", "aa"));
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        Assertions.assertEquals(List.of(1, 2, 3, 5), solution.findAnagrams("abacbabc", "abc"));
    }

    @Test
    void case5() {
        Solution solution = new Solution();
        Assertions.assertEquals(List.of(3, 4, 6), solution.findAnagrams("abaacbabc", "abc"));
    }
}