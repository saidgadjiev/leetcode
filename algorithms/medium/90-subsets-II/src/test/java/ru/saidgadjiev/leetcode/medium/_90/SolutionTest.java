package ru.saidgadjiev.leetcode.medium._90;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.subsetsWithDup(new int[]{1, 2, 2});
        Assertions.assertEquals(List.of(List.of(), List.of(1), List.of(1, 2),
                List.of(1, 2, 2), List.of(2), List.of(2, 2)), lists);
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        solution.applyMask(1, 3);
        solution.applyMask(2, 3);
    }
}