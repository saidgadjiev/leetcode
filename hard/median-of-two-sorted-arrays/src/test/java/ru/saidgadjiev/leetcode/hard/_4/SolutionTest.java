package ru.saidgadjiev.leetcode.hard._4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMedianSortedArrays() {
        double median = new Solution().findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 });

        Assertions.assertEquals(2, median);
    }
}