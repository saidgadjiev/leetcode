package ru.gadjini.leetcode._1137;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int tribonacci = solution.tribonacci(4);
        Assertions.assertEquals(4, tribonacci);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int tribonacci = solution.tribonacci(25);
        Assertions.assertEquals(1389537, tribonacci);
    }
}