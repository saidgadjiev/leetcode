package ru.saidgadjiev.leetcode.easy._283;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void moveZeroes() {
        int[] arr = new int[] { 4,2,4,0,0,3,0,5,1,0 };

        new Solution().moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }
}