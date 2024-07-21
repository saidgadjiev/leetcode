package ru.saidgadjiev.leetcode.algorithms;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<String> strings = solution.letterCombinations("23");
        Assertions.assertEquals(List.of("ad","ae","af","bd","be","bf","cd","ce","cf"), strings);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        List<String> strings = solution.letterCombinations("");
        Assertions.assertTrue(strings.isEmpty());
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        List<String> strings = solution.letterCombinations("2");
        Assertions.assertEquals(List.of("a","b","c"), strings);
    }
}
