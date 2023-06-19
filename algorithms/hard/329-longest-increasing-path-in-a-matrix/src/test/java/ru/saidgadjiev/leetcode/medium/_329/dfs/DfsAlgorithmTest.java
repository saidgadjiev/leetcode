package ru.saidgadjiev.leetcode.medium._329.dfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DfsAlgorithmTest {

    @Test
    void case1() {
        DfsAlgorithm dfsAlgorithm = new DfsAlgorithm();
        int i = dfsAlgorithm.longestIncreasingPath(new int[][]{
                {9, 9, 4}, {6, 6, 8}, {2, 1, 1}
        });
        Assertions.assertEquals(4, i);
    }

    @Test
    void case2() {
        DfsAlgorithm dfsAlgorithm = new DfsAlgorithm();
        int i = dfsAlgorithm.longestIncreasingPath(new int[][]{
                {3, 4, 5}, {3, 2, 6}, {2, 2, 1}
        });
        Assertions.assertEquals(4, i);
    }

}