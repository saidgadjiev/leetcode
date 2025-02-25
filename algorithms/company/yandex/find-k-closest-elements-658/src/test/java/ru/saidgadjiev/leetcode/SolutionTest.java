package ru.saidgadjiev.leetcode;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<Integer> closestElements = solution.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3);

        Assertions.assertEquals(List.of(1, 2, 3, 4), closestElements);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        List<Integer> closestElements = solution.findClosestElements(new int[]{1, 1, 2, 3, 4, 5}, 4, -1);

        Assertions.assertEquals(List.of(1,1,2,3), closestElements);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        List<Integer> closestElements = solution.findClosestElements(new int[]{1}, 1, 1);

        Assertions.assertEquals(List.of(1), closestElements);
    }
}
