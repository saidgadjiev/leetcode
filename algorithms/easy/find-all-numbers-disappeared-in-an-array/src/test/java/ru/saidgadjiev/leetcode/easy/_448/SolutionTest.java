package ru.saidgadjiev.leetcode.easy._448;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findDisappearedNumbers() {
        List<Integer> result = new Solution().findDisappearedNumbers(new int[] { 1, 1, 1, 4 });

        Assertions.assertEquals(result, Arrays.asList(5, 6));
    }
}