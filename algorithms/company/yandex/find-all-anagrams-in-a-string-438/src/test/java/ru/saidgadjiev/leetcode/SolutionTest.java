package ru.saidgadjiev.leetcode;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<Integer> anagrams = solution.findAnagrams("cbaebabacd", "abc");

        Assertions.assertEquals(List.of(0, 6), anagrams);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        List<Integer> anagrams = solution.findAnagrams("abab", "ab");

        Assertions.assertEquals(List.of(0, 1, 2), anagrams);
    }
}
