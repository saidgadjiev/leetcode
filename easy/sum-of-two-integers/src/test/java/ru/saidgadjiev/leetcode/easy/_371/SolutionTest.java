package ru.saidgadjiev.leetcode.easy._371;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void getSum() {
        int result = new Solution().getSum(-3, 2);

        Assertions.assertEquals(-1, result);
    }
}