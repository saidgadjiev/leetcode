package ru.saidgadjiev.leetcode.medium._33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int search = solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        Assertions.assertEquals(4, search);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int search = solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3);
        Assertions.assertEquals(-1, search);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int search = solution.search(new int[]{1}, 0);
        Assertions.assertEquals(-1, search);
    }
}