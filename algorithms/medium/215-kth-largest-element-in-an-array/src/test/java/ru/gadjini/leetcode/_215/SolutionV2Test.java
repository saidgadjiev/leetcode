package ru.gadjini.leetcode._215;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionV2Test {

    @Test
    void case1() {
        SolutionV2 solution = new SolutionV2();
        int kthLargest = solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        Assertions.assertEquals(5, kthLargest);
    }

    @Test
    void case2() {
        SolutionV2 solution = new SolutionV2();
        int kthLargest = solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
        Assertions.assertEquals(4, kthLargest);
    }

    @Test
    void case3() {
        SolutionV2 solution = new SolutionV2();
        int kthLargest = solution.findKthLargest(new int[]{-10, -8, -5, 3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
        Assertions.assertEquals(4, kthLargest);
    }
}