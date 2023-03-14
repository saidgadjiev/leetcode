package ru.saidgadjiev.leetcode.easy._200;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        Assertions.assertEquals(1, solution.numIslands(new char[][] {{'1','1','1','1','0'},
                {'1','1','0','1','0'}, {'1','1','0','0','0'}, {'0','0','0','0','0'}}));
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        Assertions.assertEquals(3, solution.numIslands(new char[][] {{'1','1','0','0','0'},
                {'1','1','0','0','0'}, {'0','0','1','0','0'}, {'0','0','0','1','1'}}));
    }
}