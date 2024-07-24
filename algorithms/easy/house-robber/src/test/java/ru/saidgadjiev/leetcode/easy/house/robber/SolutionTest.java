package ru.saidgadjiev.leetcode.easy.house.robber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        int result = new Solution().rob(new int[] { 1, 2, 3, 1 });

        Assertions.assertEquals(4, result);
    }

    @Test
    void case2() {
        int result = new Solution().rob(new int[] { 2,7,9,3,1 });

        Assertions.assertEquals(12, result);
    }

    @Test
    void case3() {
        int result = new Solution().rob(new int[] { 1 });

        Assertions.assertEquals(1, result);
    }

    @Test
    void case4() {
        int result = new Solution().rob(new int[] { 1, 2 });

        Assertions.assertEquals(2, result);
    }

    @Test
    void case5() {
        int result = new Solution().rob(new int[] { 2, 1, 1, 2 });

        Assertions.assertEquals(4, result);
    }

    @Test
    void case6() {
        int result = new Solution().rob(new int[] { 2, 1 });

        Assertions.assertEquals(2, result);
    }
}
