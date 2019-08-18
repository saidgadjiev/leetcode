package ru.saidgadjiev.leetcode.easy._53;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxSubArray() {
        int result = new Solution().maxSubArray(new int[] { -2,1,-3,4,-1,2,1,-5,4 });

        Assertions.assertEquals(result, 6);
    }
}