package ru.saidgadjiev.leetcode;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<String> strings = solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});

        Assertions.assertEquals(List.of("0->2", "4->5", "7"), strings);
    }
}
