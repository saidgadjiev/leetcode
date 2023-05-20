package ru.saidgadjiev.leetcode.medium._310;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<Integer> minHeightTrees = solution.findMinHeightTrees(4, new int[][]{
                {1, 0}, {1, 2}, {1, 3}
        });

        Assertions.assertEquals(List.of(1), minHeightTrees);
    }


    @Test
    void case2() {
        Solution solution = new Solution();
        List<Integer> minHeightTrees = solution.findMinHeightTrees(6, new int[][]{
                {3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}
        });
        Assertions.assertEquals(List.of(3, 4), minHeightTrees);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        List<Integer> minHeightTrees = solution.findMinHeightTrees(1, new int[][]{});
        Assertions.assertEquals(List.of(1), minHeightTrees);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        List<Integer> minHeightTrees = solution.findMinHeightTrees(6, new int[][]{
                {0, 1}, {0, 2}, {0, 3}, {3, 4}, {4, 5}
        });
        Assertions.assertEquals(List.of(3), minHeightTrees);
    }
}