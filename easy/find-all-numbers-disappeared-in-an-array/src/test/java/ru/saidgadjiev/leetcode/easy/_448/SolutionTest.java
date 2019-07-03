package ru.saidgadjiev.leetcode.easy._448;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findDisappearedNumbers() {
        List<Integer> result = new Solution().findDisappearedNumbers(new int[] { 4,3,2,7,8,2,3,1 });

        Assertions.assertEquals(result, Arrays.asList(5, 6));
    }
}