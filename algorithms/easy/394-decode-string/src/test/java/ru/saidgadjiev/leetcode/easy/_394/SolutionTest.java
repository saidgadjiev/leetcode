package ru.saidgadjiev.leetcode.easy._394;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        Assertions.assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        Assertions.assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        Assertions.assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        Assertions.assertEquals("abccdcdcdxyz", solution.decodeString("abc3[cd]xyz"));
    }

    @Test
    void case5() {
        Solution solution = new Solution();
        Assertions.assertEquals("abccdaaaanncdaaaanncdaaaannxyz", solution.decodeString("abc3[cd2[aa]nn]xyz"));
    }

    @Test
    void case6() {
        Solution solution = new Solution();
        Assertions.assertEquals("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode", solution.decodeString("100[leetcode]"));
    }

    @Test
    void case7() {
        Solution solution = new Solution();
        Assertions.assertEquals("zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef", solution.decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));
    }
}