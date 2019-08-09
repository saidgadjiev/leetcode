package ru.saidgadjiev.leetcode.medium._62;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void uniquePaths() {
        int result = new Solution().uniquePaths(3, 2);

        Assertions.assertEquals(result, 3);
    }
}