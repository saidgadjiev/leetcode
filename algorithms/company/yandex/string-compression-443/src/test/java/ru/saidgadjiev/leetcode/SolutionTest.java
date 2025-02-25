package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int compress = solution.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'});
        Assertions.assertEquals(6, compress);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int compress = solution.compress(new char[]{'a'});

        Assertions.assertEquals(1, compress);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int compress = solution.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'});

        Assertions.assertEquals(4, compress);
    }
}
