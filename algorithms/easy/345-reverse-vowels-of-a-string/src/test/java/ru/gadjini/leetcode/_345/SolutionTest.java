package ru.gadjini.leetcode._345;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        String result = solution.reverseVowels("hello");
        Assertions.assertEquals("holle", result);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        String result = solution.reverseVowels("leetcode");
        Assertions.assertEquals("leotcede", result);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        String result = solution.reverseVowels("aA");
        Assertions.assertEquals("Aa", result);
    }
}