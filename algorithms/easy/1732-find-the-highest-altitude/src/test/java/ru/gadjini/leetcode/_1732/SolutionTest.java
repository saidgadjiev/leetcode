package ru.gadjini.leetcode._1732;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.largestAltitude(new int[]{-5, 1, 5, 0, -7});
        Assertions.assertEquals(1, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2});
        Assertions.assertEquals(0, i);
    }
}