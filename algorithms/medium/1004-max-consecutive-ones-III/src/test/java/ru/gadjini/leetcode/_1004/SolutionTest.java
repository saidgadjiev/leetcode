package ru.gadjini.leetcode._1004;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2);
        Assertions.assertEquals(6, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3);
        Assertions.assertEquals(10, i);
    }
}