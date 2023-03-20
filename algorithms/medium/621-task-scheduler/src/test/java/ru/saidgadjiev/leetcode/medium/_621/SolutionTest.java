package ru.saidgadjiev.leetcode.medium._621;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2);
        Assertions.assertEquals(8, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0);
        Assertions.assertEquals(6, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.leastInterval(new char[]{'A','A','A','A','A','A','B','C','D','E','F','G'}, 2);
        Assertions.assertEquals(16, i);
    }
}