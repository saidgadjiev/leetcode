package ru.saidgadjiev.leetcode.medium._289;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void gameOfLife() {
        new Solution().gameOfLife(new int[][] {
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        });
    }
}