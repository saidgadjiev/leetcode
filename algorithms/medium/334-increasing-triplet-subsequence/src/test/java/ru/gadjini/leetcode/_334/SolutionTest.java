package ru.gadjini.leetcode._334;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        boolean b = solution.increasingTriplet(new int[]{1, 2, 3, 4, 5});
        Assertions.assertTrue(b);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        boolean b = solution.increasingTriplet(new int[]{5,4,3,2,1});
        Assertions.assertFalse(b);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        boolean b = solution.increasingTriplet(new int[]{2,1,5,0,4,6});
        Assertions.assertTrue(b);
    }
}