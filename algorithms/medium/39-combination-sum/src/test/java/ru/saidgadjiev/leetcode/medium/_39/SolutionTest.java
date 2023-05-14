package ru.saidgadjiev.leetcode.medium._39;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.combinationSum(new int[]{2, 3, 6, 7}, 7);

        Assertions.assertEquals(List.of(List.of(2,2,3), List.of(7)), lists);
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.combinationSum(new int[]{2, 3, 5}, 8);
        Assertions.assertEquals(List.of(List.of(2,2,2,2), List.of(2, 3, 3), List.of(3, 5)), lists);
    }

}