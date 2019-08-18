package ru.saidgadjiev.leetcode.hard._42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void trap() {
        int trap = new Solution().trap(new int[] { 4,3,2,0,3,2 });

        Assertions.assertEquals(6, trap);
    }
}