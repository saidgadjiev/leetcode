package ru.saidgadjiev.leetcode.easy._54;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://leetcode.com/problems/spiral-matrix
 */
class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<Integer> integers = solution.spiralOrder(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });

        Assertions.assertEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5), integers);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        List<Integer> integers = solution.spiralOrder(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        });

        Assertions.assertEquals(List.of(1,2,3,4,8,12,11,10,9,5,6,7), integers);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        List<Integer> integers = solution.spiralOrder(new int[][]{
                {1, 2},
                {5, 6},
                {9, 10}
        });

        Assertions.assertEquals(List.of(1,2,6,10,9,5), integers);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        List<Integer> integers = solution.spiralOrder(new int[][]{
                {1},
                {5},
                {9}
        });

        Assertions.assertEquals(List.of(1, 5, 9), integers);
    }

    @Test
    void case5() {
        Solution solution = new Solution();
        List<Integer> integers = solution.spiralOrder(new int[][]{
                {1}
        });

        Assertions.assertEquals(List.of(1), integers);
    }

    @Test
    void case6() {
        Solution solution = new Solution();
        List<Integer> integers = solution.spiralOrder(new int[][]{
                {1,2,3,4,5,6},
                {1,2,3,4,5,6}
        });

        Assertions.assertEquals(List.of(1, 2, 3, 4, 5, 6, 6, 5, 4, 3, 2, 1), integers);
    }
}