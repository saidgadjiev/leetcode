package ru.saidgadjiev.leetcode.medium._361;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxKilledEnemies() {
        int result = new Solution().maxKilledEnemies(new char[][]{
                {'0', 'E', '0', '0'},
                {'E', '0', 'W', 'E'},
                {'0', 'E', '0', '0'},
        });

        Assertions.assertEquals(3, result);
    }
}