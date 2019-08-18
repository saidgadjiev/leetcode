package ru.saidgadjiev.leetcode.easy._88;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void merge() {
        int[] arr = new int[] { 0 };

        new Solution().merge(arr, 0, new int[] { 1 }, 1);

        Assertions.assertArrayEquals(new int[] { 1,2,2,3,5,6 }, arr);
    }
}