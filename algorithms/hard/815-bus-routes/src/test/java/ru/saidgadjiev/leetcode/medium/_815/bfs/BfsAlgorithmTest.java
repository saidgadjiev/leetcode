package ru.saidgadjiev.leetcode.medium._815.bfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.medium._815.Solution;

import static org.junit.jupiter.api.Assertions.*;

class BfsAlgorithmTest {

    @Test
    void case1() {
        BfsAlgorithm solution = new BfsAlgorithm();
        int i = solution.numBusesToDestination(new int[][]{
                {1, 2, 7},
                {3, 6, 7}
        }, 1, 6);
        Assertions.assertEquals(2, i);
    }

    @Test
    void case2() {
        BfsAlgorithm bfsAlgorithm = new BfsAlgorithm();
        int i = bfsAlgorithm.numBusesToDestination(new int[][]{{1, 7}, {3, 5}}, 5, 5);
        Assertions.assertEquals(0, i);
    }
}