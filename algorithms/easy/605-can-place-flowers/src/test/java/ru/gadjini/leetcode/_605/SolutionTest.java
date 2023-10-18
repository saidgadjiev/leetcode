package ru.gadjini.leetcode._605;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        boolean b = solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1);
        Assertions.assertTrue(b);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        boolean b = solution.canPlaceFlowers(new int[] {1,0,0,0,1}, 2);
        Assertions.assertFalse(b);
    }

}