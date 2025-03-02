package ru.saidgadjiev.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);

        Assertions.assertEquals(3, lists.size());
        Assertions.assertEquals(List.of(-2,-1,1,2), lists.get(0));
        Assertions.assertEquals(List.of(-2,0,0,2), lists.get(1));
        Assertions.assertEquals(List.of(-1,0,0,1), lists.get(3));
    }
}
