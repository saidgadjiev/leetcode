package ru.saidgadjiev.leetcode.medium._417;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.pacificAtlantic(new int[][]{
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        });

        Assertions.assertEquals(List.of(List.of(0,4), List.of(1,3),
                List.of(1,4), List.of(2,2),List.of(3,0),List.of(3,1),List.of(4,0)), lists);
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.pacificAtlantic(new int[][]{
                {1}
        });

        Assertions.assertEquals(List.of(List.of(0,0)), lists);
    }

    @Test
    public void case3() {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.pacificAtlantic(new int[][]{
                {1,2,3},{8,9,4},{7,6,5}
        });

        Assertions.assertEquals(List.of(List.of(0,2),List.of(1,0),List.of(1,1),List.of(1,2)
                ,List.of(2,0),List.of(2,1),List.of(2,2)), lists);
    }

    @Test
    public void case4() {
        Solution solution = new Solution();

        List<List<Integer>> lists = solution.pacificAtlantic(new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        });

        Assertions.assertEquals(List.of(List.of(0,0)), lists);
    }

}