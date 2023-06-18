package ru.saidgadjiev.leetcode.medium._261.unionfind;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnionFindAlgorithmTest {

    @Test
    void case1() {
        UnionFindAlgorithm dfsAlgorithm = new UnionFindAlgorithm();
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
        UnionFindAlgorithm dfsAlgorithm = new UnionFindAlgorithm();
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
        UnionFindAlgorithm dfsAlgorithm = new UnionFindAlgorithm();
        boolean b = dfsAlgorithm.validTree(1, new int[][]{
                {1}
        });
        Assertions.assertTrue(b);
    }

    @Test
    void case4() {
        UnionFindAlgorithm dfsAlgorithm = new UnionFindAlgorithm();
        boolean b = dfsAlgorithm.validTree(4, new int[][]{
                {2, 3},
                {1, 2},
                {1, 3}
        });
        Assertions.assertFalse(b);
    }

    @Test
    void case5() {
        UnionFindAlgorithm dfsAlgorithm = new UnionFindAlgorithm();
        boolean b = dfsAlgorithm.validTree(2, new int[][]{
                {1, 0}
        });
        Assertions.assertTrue(b);
    }

    @Test
    void case6() {
        UnionFindAlgorithm unionFindAlgorithm = new UnionFindAlgorithm();
        boolean b = unionFindAlgorithm.validTree(3, new int[][]{
                {1, 0},
                {0, 1}
        });
        Assertions.assertTrue(b);
    }

}