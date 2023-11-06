package ru.gadjini.leetcode._215;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int kthLargest = solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        Assertions.assertEquals(5, kthLargest);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int kthLargest = solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
        Assertions.assertEquals(4, kthLargest);
    }
}