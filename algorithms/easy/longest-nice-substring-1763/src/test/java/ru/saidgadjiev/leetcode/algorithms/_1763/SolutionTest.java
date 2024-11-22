package ru.saidgadjiev.leetcode.algorithms._1763;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        String longestNiceSubstring = solution.longestNiceSubstring("YazaAay");

        Assertions.assertEquals("aAa", longestNiceSubstring);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        String longestNiceSubstring = solution.longestNiceSubstring("Bb");

        Assertions.assertEquals("Bb", longestNiceSubstring);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        String longestNiceSubstring = solution.longestNiceSubstring("c");

        Assertions.assertEquals("", longestNiceSubstring);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        String longestNiceSubstring = solution.longestNiceSubstring("ZyaaYaaAay");

        Assertions.assertEquals("yaaYaaAay", longestNiceSubstring);
    }
}
