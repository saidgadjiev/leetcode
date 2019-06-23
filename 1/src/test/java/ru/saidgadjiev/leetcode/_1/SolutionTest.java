package ru.saidgadjiev.leetcode._1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void twoSum() {
        int[] result = new Solution().twoSum(new int[] { 3, 2, 3 }, 6);

        Assertions.assertArrayEquals(result, new int[] { 0, 2 });
    }
}