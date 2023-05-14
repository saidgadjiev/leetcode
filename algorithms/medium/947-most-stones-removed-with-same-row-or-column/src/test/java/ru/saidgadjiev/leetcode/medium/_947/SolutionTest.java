package ru.saidgadjiev.leetcode.medium._947;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        int i = solution.removeStones(new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}});

        Assertions.assertEquals(5, i);
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        int i = solution.removeStones(new int[][] {{0,0},{0,2},{1,1},{2,0},{2,2}});
        Assertions.assertEquals(3, i);
    }

}