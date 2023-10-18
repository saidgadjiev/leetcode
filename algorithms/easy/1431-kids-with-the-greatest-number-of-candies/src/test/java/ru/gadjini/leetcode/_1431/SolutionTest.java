package ru.gadjini.leetcode._1431;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<Boolean> booleans = solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        Assertions.assertEquals(List.of(true,true,true,false,true), booleans);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        List<Boolean> booleans = solution.kidsWithCandies(new int[]{4,2,1,1,2}, 1);
        Assertions.assertEquals(List.of(true,false,false,false,false), booleans);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        List<Boolean> booleans = solution.kidsWithCandies(new int[]{12,1,12}, 10);
        Assertions.assertEquals(List.of(true,false,true), booleans);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        List<Boolean> booleans = solution.kidsWithCandies(new int[]{2,8,7}, 1);
        Assertions.assertEquals(List.of(false, true,true), booleans);
    }
}