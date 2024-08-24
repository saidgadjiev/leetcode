package ru.saidgadjiev.leetcode.algorithms._435;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}});
        Assertions.assertEquals(1, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}});
        Assertions.assertEquals(2, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}});
        Assertions.assertEquals(0, i);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        int i = solution.eraseOverlapIntervals(new int[][]{
            {-52, 31}, {-73, -26}, {82, 97}, {-65, -11}, {-62, -49}, {95, 99}, {58, 95}, {-31, 49}, {66, 98}, {-63, 2},
            {30, 47}, {-40, -26}
        });

        Assertions.assertEquals(7, i);
    }
}
