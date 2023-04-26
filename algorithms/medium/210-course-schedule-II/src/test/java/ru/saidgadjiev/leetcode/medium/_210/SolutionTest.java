package ru.saidgadjiev.leetcode.medium._210;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        int[] order = solution.findOrder(2, new int[][]{{1, 0}});
        Assertions.assertArrayEquals(new int[] {0, 1}, order);
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        int[] order = solution.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}});
        Assertions.assertArrayEquals(new int[] {0,1,2,3}, order);
    }

    @Test
    public void case3() {
        Solution solution = new Solution();
        int[] order = solution.findOrder(1, new int[][]{});

        Assertions.assertArrayEquals(new int[]{0}, order);
    }

    @Test
    public void case4() {
        Solution solution = new Solution();
        int[] order = solution.findOrder(2, new int[][]{{0, 1}, {1, 0}});
        Assertions.assertArrayEquals(new int[] {}, order);
    }

    @Test
    public void case5() {
        Solution solution = new Solution();
        int[] order = solution.findOrder(7, new int[][]{{1, 0}, {0, 3}, {0, 2}, {3, 2}, {2, 5}, {4, 5}, {5, 6}, {2, 4}});

        Assertions.assertArrayEquals(new int[] {6, 5, 4, 2, 3, 0, 1}, order);
    }

    @Test
    public void case6() {
        Solution solution = new Solution();
        int[] order = solution.findOrder(8, new int[][]{{1, 0}, {2, 6}, {1, 7}, {6, 4}, {7, 0}, {0, 5}});
        Assertions.assertArrayEquals(new int[] {}, order);
    }
}