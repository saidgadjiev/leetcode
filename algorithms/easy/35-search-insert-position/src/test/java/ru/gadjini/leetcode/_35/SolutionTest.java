package ru.gadjini.leetcode._35;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.searchInsert(new int[]{1, 3, 5, 6}, 5);
        Assertions.assertEquals(2, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.searchInsert(new int[]{1,3,5,6}, 2);
        Assertions.assertEquals(1, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.searchInsert(new int[]{1,3,5,6}, 7);
        Assertions.assertEquals(4, i);
    }
}