package ru.gadjini.leetcode._283;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int[] ints = {0, 1, 0, 3, 12};
        solution.moveZeroes(ints);

        Assertions.assertArrayEquals(new int[] {1,3,12,0,0}, ints);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int[] ints = new int[] {0, 1};
        solution.moveZeroes(ints);

        Assertions.assertArrayEquals(new int[] {1,0}, ints);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int[] ints = new int[] {0};
        solution.moveZeroes(ints);

        Assertions.assertArrayEquals(new int[] {0}, ints);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        int[] ints = new int[] {0,0,0,0,0,0,0};
        solution.moveZeroes(ints);

        Assertions.assertArrayEquals(new int[] {0,0,0,0,0,0,0}, ints);
    }

    @Test
    void case5() {
        Solution solution = new Solution();
        int[] ints = new int[] {1, 5};
        solution.moveZeroes(ints);

        Assertions.assertArrayEquals(new int[] {1, 5}, ints);
    }

    @Test
    void case6() {
        Solution solution = new Solution();
        int[] ints = new int[] {4,2,4,0,0,3,0,5,1,0};
        solution.moveZeroes(ints);

        Assertions.assertArrayEquals(new int[] {4,2,4,3,5,1,0,0,0,0}, ints);
    }
}