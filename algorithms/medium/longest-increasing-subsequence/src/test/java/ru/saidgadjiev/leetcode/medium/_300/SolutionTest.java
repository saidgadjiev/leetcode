package ru.saidgadjiev.leetcode.medium._300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLIS() {
        int result = new Solution().lengthOfLIS(new int[] { 10,9,2,5,3,7,101,18 });

        Assertions.assertEquals(4, result);
    }
}