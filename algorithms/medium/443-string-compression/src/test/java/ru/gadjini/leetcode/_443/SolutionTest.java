package ru.gadjini.leetcode._443;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int aabbccc = solution.compress("aabbbbccc".toCharArray());
        Assertions.assertEquals(6, aabbccc);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int aabbccc = solution.compress("a".toCharArray());
        Assertions.assertEquals(1, aabbccc);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int aabbccc = solution.compress("abbbbbbbbbbbb".toCharArray());
        Assertions.assertEquals(4, aabbccc);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        int aabbccc = solution.compress("abc".toCharArray());
        Assertions.assertEquals(3, aabbccc);
    }

    @Test
    void case5() {
        Solution solution = new Solution();
        int aabbccc = solution.compress("aaaaab".toCharArray());
        Assertions.assertEquals(3, aabbccc);
    }
}