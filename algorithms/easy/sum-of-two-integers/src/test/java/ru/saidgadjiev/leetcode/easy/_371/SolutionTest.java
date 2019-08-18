package ru.saidgadjiev.leetcode.easy._371;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void getSum() {
        int result = new Solution().getSum(4, 2);

        Assertions.assertEquals(6, result);
    }
}