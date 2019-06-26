package ru.saidgadjiev.leetcode._79;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void exist() {
        boolean result = new Solution().exist(new char[][]{
                {'A','B','C','E'},
                {'S','F','E','S'},
                {'A','D','E','E'}
        }, "ABCESEEEFS");

        Assertions.assertTrue(result);
    }
}