package ru.gadjini.leetcode._151;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        String result = solution.reverseWords("the sky is blue");
        Assertions.assertEquals("blue is sky the", result);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        String result = solution.reverseWords("  hello world  ");
        Assertions.assertEquals("world hello", result);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        String result = solution.reverseWords("a good   example");
        Assertions.assertEquals("example good a", result);
    }
}