package ru.saidgadjiev.leetcode.easy._1539;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int kthPositive = solution.findKthPositive(new int[]{2, 3, 4, 7, 11}, 5);
        Assertions.assertEquals(9, kthPositive);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int kthPositive = solution.findKthPositive(new int[]{1,2,3,4}, 2);
        Assertions.assertEquals(6, kthPositive);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int kthPositive = solution.findKthPositive(new int[]{2}, 1);
        Assertions.assertEquals(1, kthPositive);
    }
}