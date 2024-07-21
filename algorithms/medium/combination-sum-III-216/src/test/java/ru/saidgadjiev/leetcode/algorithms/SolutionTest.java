package ru.saidgadjiev.leetcode.algorithms;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.combinationSum3(3, 7);

        Assertions.assertEquals(List.of(List.of(1, 2, 4)), lists);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.combinationSum3(3, 9);
        Assertions.assertEquals(List.of(List.of(1, 2, 6), List.of(1, 3, 5), List.of(2, 3, 4)), lists);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.combinationSum3(4, 1);
        Assertions.assertTrue(lists.isEmpty());
    }
}
