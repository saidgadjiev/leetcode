package ru.saidgadjiev.leetcode.medium._46;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        List<List<Integer>> permute = solution.permute(new int[]{1, 2, 3});
        Assertions.assertEquals(List.of(List.of(1, 2, 3), List.of(1, 3, 2),
                List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 2, 1), List.of(3, 1, 2)), permute);
    }

}