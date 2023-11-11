package ru.saidgadjiev.leetcode.easy._704;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionV2Test {

    @Test
    void case1() {
        SolutionV2 solution = new SolutionV2();
        int search = solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        Assertions.assertEquals(4, search);
    }

    @Test
    void case2() {
        SolutionV2 solution = new SolutionV2();
        int search = solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        Assertions.assertEquals(-1, search);
    }

    @Test
    void case3() {
        SolutionV2 solution = new SolutionV2();
        int search = solution.search(new int[]{5}, 5);
        Assertions.assertEquals(0, search);
    }

    @Test
    void case4() {
        SolutionV2 solution = new SolutionV2();
        int search = solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 15);
        Assertions.assertEquals(4, search);
    }
}