package ru.saidgadjiev.leetcode.algorithms;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchSolutionTest {

    @Test
    void case1() {
        BinarySearchSolution solution = new BinarySearchSolution();
        List<Integer> integers = solution.countSmaller(new int[]{5, 2, 6, 1});

        Assertions.assertEquals(List.of(2, 1, 1, 0), integers);
    }

    @Test
    void case2() {
        BinarySearchSolution solution = new BinarySearchSolution();
        List<Integer> integers = solution.countSmaller(new int[]{-1});

        Assertions.assertEquals(List.of(0), integers);
    }

    @Test
    void case3() {
        BinarySearchSolution solution = new BinarySearchSolution();
        List<Integer> integers = solution.countSmaller(new int[]{-1, -1});
        Assertions.assertEquals(List.of(0, 0), integers);
    }
}
