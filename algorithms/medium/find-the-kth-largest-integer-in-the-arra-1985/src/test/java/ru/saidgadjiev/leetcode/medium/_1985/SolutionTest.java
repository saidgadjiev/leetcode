package ru.saidgadjiev.leetcode.medium._1985;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        String s = solution.kthLargestNumber(new String[]{"3", "6", "7", "10"}, 4);

        Assertions.assertEquals("3", s);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        String s = solution.kthLargestNumber(new String[]{"2","21","12","1"}, 3);

        Assertions.assertEquals("2", s);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        String s = solution.kthLargestNumber(new String[]{"0","0"}, 2);

        Assertions.assertEquals("0", s);
    }
}
