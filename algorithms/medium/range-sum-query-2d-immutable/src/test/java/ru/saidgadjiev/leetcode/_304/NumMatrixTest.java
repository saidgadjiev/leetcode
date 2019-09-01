package ru.saidgadjiev.leetcode._304;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumMatrixTest {

    @Test
    void sumRegion() {
        int sum = new NumMatrix(new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        }).sumRegion(2, 1, 4, 5);

        Assertions.assertEquals(8, sum);
    }
}