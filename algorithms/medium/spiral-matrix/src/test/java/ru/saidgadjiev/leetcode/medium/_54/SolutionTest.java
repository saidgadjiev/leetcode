package ru.saidgadjiev.leetcode.medium._54;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void spiralOrder() {
        List<Integer> result = new Solution().spiralOrder(new int[][]{
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        });

        Assertions.assertIterableEquals(result, Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7));

        List<Integer> result1 = new Solution().spiralOrder(new int[][]{{ 2, 3 }});

        Assertions.assertIterableEquals(result1, Arrays.asList(2, 3));
    }
}