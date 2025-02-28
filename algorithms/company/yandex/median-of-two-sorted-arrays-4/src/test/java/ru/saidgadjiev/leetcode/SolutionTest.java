package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});

        Assertions.assertEquals(2f, medianSortedArrays);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});

        Assertions.assertEquals(2.5f, medianSortedArrays);
    }
}
