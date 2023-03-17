package ru.saidgadjiev.leetcode.easy._43;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        String multiply = solution.multiply("123", "456");

        Assertions.assertEquals("56088", multiply);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        String multiply = solution.multiply("999", "999");

        Assertions.assertEquals("998001", multiply);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        String multiply = solution.multiply("2", "3");

        Assertions.assertEquals("6", multiply);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        String multiply = solution.multiply("9", "9");

        Assertions.assertEquals("81", multiply);
    }

    @Test
    void case5() {
        Solution solution = new Solution();
        String multiply = solution.multiply("1", "0");

        Assertions.assertEquals("0", multiply);
    }

    @Test
    void case6() {
        Solution solution = new Solution();
        String multiply = solution.multiply("45", "12344532");

        Assertions.assertEquals("555503940", multiply);
    }

    @Test
    void case7() {
        Solution solution = new Solution();
        String multiply = solution.multiply("12344532", "45");

        Assertions.assertEquals("555503940", multiply);
    }

    @Test
    void case8() {
        Solution solution = new Solution();
        String multiply = solution.multiply("9133", "0");
        Assertions.assertEquals("0", multiply);
    }

    @Test
    void case9() {
        Solution solution = new Solution();
        String multiply = solution.multiply("140", "721");
        Assertions.assertEquals("100940", multiply);
    }
}