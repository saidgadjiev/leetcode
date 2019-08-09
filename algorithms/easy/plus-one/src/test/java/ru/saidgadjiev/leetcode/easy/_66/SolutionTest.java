package ru.saidgadjiev.leetcode.easy._66;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void plusOne() {
        int[] result = new Solution().plusOne(new int[] { 1, 1, 2 });

        System.out.println(Arrays.toString(result));
    }
}