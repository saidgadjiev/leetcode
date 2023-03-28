package ru.saidgadjiev.leetcode.medium._994;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.orangesRotting(new int[][]{
                {2, 1, 1}, {1, 1, 0}, {0, 1, 1}
        });

        System.out.println(i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.orangesRotting(new int[][]{
                {2,1,1},{1,1,1},{0,1,2}
        });

        System.out.println(i);
    }
}