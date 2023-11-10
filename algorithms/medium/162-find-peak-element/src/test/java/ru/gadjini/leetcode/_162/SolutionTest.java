package ru.gadjini.leetcode._162;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int peakElement = solution.findPeakElement(new int[]{1, 2, 3, 1});
        Assertions.assertEquals(2, peakElement);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int peakElement = solution.findPeakElement(new int[]{1,2,1,3,5,6,4});
        Assertions.assertEquals(5, peakElement);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int peakElement = solution.findPeakElement(new int[]{1,2,1,3,5,6,7});
        Assertions.assertEquals(6, peakElement);
    }
}