package ru.saidgadjiev.leetcode._395;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.longestSubstring("aaabb", 3);
        Assertions.assertEquals(3, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.longestSubstring("ababbc", 2);
        Assertions.assertEquals(5, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.longestSubstring("bacbbc", 2);
        Assertions.assertEquals(4, i);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        int i = solution.longestSubstring("bbcc", 2);
        Assertions.assertEquals(4, i);
    }

    @Test
    void case5() {
        Solution solution = new Solution();
        int i = solution.longestSubstring("ababacb", 3);
        Assertions.assertEquals(0, i);
    }

    @Test
    void case6() {
        Solution solution = new Solution();
        int i = solution.longestSubstring("aaaaaaaaaaaabcdefghijklmnopqrstuvwzyz", 3);
        Assertions.assertEquals(12, i);
    }
}
