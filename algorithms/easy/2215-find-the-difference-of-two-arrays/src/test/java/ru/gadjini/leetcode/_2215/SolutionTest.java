package ru.gadjini.leetcode._2215;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<List<Integer>> difference = solution.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6});
        Assertions.assertEquals(List.of(List.of(1, 3), List.of(4, 6)), difference);
    }


}