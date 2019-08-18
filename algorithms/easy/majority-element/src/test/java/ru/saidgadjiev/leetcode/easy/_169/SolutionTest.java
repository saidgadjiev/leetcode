package ru.saidgadjiev.leetcode.easy._169;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void majorityElement() {
        int result = new Solution().bitMajorityElement(new int[] { 3, 2, 3 });

        //11 10 11
        //2 3

        Assertions.assertEquals(3, result);
    }
}