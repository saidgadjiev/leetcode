package ru.saidgadjiev.leetcode.easy._167;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum() {
        int[] result = new Solution().twoSum(new int[] { -1, 0 }, -1);

        Assertions.assertArrayEquals(new int[] { 1, 2 }, result);
    }
}