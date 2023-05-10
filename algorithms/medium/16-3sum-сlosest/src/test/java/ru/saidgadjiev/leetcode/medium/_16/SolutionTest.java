package ru.saidgadjiev.leetcode.medium._16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        int i = solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        Assertions.assertEquals(2, i);
    }


    @Test
    public void case2() {
        Solution solution = new Solution();
        int i = solution.threeSumClosest(new int[] {1,1,1,0}, -100);
        Assertions.assertEquals(2, i);
    }

    @Test
    public void case3() {
        Solution solution = new Solution();
        int i = solution.threeSumClosest(new int[]{4, 0, 5, -5, 3, 3, 0, -4, -5}, -2);
        Assertions.assertEquals(-2, i);
    }

    @Test
    public void case4() {
        Solution solution = new Solution();
        int i = solution.threeSumClosest(new int[]{-100, -98, -2, -1}, -101);
        Assertions.assertEquals(-101, i);
    }
}