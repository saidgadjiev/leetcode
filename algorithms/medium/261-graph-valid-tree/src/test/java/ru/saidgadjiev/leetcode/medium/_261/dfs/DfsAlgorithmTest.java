package ru.saidgadjiev.leetcode.medium._261.dfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DfsAlgorithmTest {

    @Test
    void case1() {
        DfsAlgorithm dfsAlgorithm = new DfsAlgorithm();
        boolean b = dfsAlgorithm.validTree(5, new int[][]{
                {0, 1},
                {0, 2},
                {0, 3},
                {1, 4}
        });
        Assertions.assertTrue(b);
    }

    @Test
    void case2() {
        DfsAlgorithm dfsAlgorithm = new DfsAlgorithm();
        boolean b = dfsAlgorithm.validTree(5, new int[][]{
                {0, 1},
                {1, 2},
                {2, 3},
                {1, 3},
                {1, 4}
        });
        Assertions.assertFalse(b);
    }

    @Test
    void case3() {
        DfsAlgorithm dfsAlgorithm = new DfsAlgorithm();
        boolean b = dfsAlgorithm.validTree(1, new int[][]{
                {1}
        });
        Assertions.assertTrue(b);
    }

    @Test
    void case4() {
        DfsAlgorithm dfsAlgorithm = new DfsAlgorithm();
        boolean b = dfsAlgorithm.validTree(4, new int[][]{
                {2, 3},
                {1, 2},
                {1, 3}
        });
        Assertions.assertFalse(b);
    }

    @Test
    void case5() {
        DfsAlgorithm dfsAlgorithm = new DfsAlgorithm();
        boolean b = dfsAlgorithm.validTree(2, new int[][]{
                {1, 0}
        });
        Assertions.assertTrue(b);
    }
}