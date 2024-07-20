package ru.saidgadjiev.leetcode.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        long l = solution.totalCost(new int[]{17, 12, 10, 2, 7, 2, 11, 20, 8}, 3, 4);

        Assertions.assertEquals(11, l);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        long l = solution.totalCost(new int[]{31, 25, 72, 79, 74, 65, 84, 91, 18, 59, 27, 9, 81, 33, 17, 58}, 11, 2);

        Assertions.assertEquals(423, l);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        long l = solution.totalCost(new int[]{1,2,4,1}, 3, 3);

        Assertions.assertEquals(4, l);
    }
}
