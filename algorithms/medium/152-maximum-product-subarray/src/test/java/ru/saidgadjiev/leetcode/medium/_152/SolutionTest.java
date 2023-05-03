package ru.saidgadjiev.leetcode.medium._152;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        int i = solution.maxProduct(new int[]{2,3,-2,4});
        Assertions.assertEquals(6, i);
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        int i = solution.maxProduct(new int[]{-2,0,-1});
        Assertions.assertEquals(0, i);
    }
}