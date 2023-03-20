package ru.saidgadjiev.leetcode.medium._2131;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.longestPalindrome(new String[]{"lc", "cl", "gg", "gg", "gg", "ab", "cb", "cc"});
        Assertions.assertEquals(10, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.longestPalindrome(new String[]{"ab","ty","yt","lc","cl","ab"});
        Assertions.assertEquals(8, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.longestPalindrome(new String[]{"cc","ll","xx"});
        Assertions.assertEquals(2, i);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        int i = solution.longestPalindrome(new String[] {"dd"});
        Assertions.assertEquals(2, i);
    }

    @Test
    void case5() {
        Solution solution = new Solution();
        int i = solution.longestPalindrome(new String[] {"lc"});
        Assertions.assertEquals(0, i);
    }

    @Test
    void case6() {
        Solution solution = new Solution();
        int i = solution.longestPalindrome(new String[] {"lc", "gg"});
        Assertions.assertEquals(2, i);
    }


    @Test
    void case7() {
        Solution solution = new Solution();
        int i = solution.longestPalindrome(new String[] {"lc", "cl"});
        Assertions.assertEquals(4, i);
    }

    @Test
    void case8() {
        Solution solution = new Solution();
        int i = solution.longestPalindrome(new String[] {"qo","fo","fq","qf","fo","ff","qq","qf","of","of","oo","of","of","qf","qf","of"});

        Assertions.assertEquals(14, i);
    }
}