package ru.saidgadjiev.leetcode.easy._121;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProfit() {
        int result = new Solution().maxProfit(new int[] { 7,1,5,3,6,4 });

        Assertions.assertEquals(5, result);
    }
}