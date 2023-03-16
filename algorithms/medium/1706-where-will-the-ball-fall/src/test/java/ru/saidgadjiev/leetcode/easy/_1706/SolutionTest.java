package ru.saidgadjiev.leetcode.easy._1706;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[] ball = solution.findBall(new int[][]{
                { 1,  1,  1, -1, -1},
                { 1,  1,  1, -1, -1},
                {-1, -1, -1,  1,  1},
                { 1,  1,  1,  1, -1},
                {-1, -1, -1, -1, -1}
        });
        Assertions.assertArrayEquals(new int[]{1,-1,-1,-1,-1}, ball);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int[] ball = solution.findBall(new int[][]{
                { 1, 1, 1, 1, 1, 1},
                {-1,-1,-1,-1,-1,-1},
                { 1, 1, 1, 1, 1, 1},
                {-1,-1,-1,-1,-1,-1}
        });
        Assertions.assertArrayEquals(new int[]{0,1,2,3,4,-1}, ball);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int[] ball = solution.findBall(new int[][]{
                { -1 }
        });
        Assertions.assertArrayEquals(new int[]{ -1 }, ball);
    }
}