package ru.saidgadjiev.leetcode.algorithms._1318;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.minFlips(2, 6, 5);
        Assertions.assertEquals(3, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.minFlips(4, 2, 7);
        Assertions.assertEquals(1, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.minFlips(1, 2, 3);
        Assertions.assertEquals(0, i);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        int i = solution.minFlips(8, 3, 5);
        Assertions.assertEquals(3, i);
    }
}
