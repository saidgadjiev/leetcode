package ru.saidgadjiev.leetcode.medium._983;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mincostTickets() {
        int res = new Solution().mincostTickets(new int[] {1,4,6,7,8,20}, new int[] {2,7,15});

        Assertions.assertEquals(11, res);
    }
}