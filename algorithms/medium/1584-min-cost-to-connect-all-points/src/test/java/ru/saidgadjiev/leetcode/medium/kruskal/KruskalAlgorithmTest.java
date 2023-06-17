package ru.saidgadjiev.leetcode.medium.kruskal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.medium._1584.kruskal.KruskalAlgorithm;

class KruskalAlgorithmTest {

    @Test
    public void case1() {
        KruskalAlgorithm solution = new KruskalAlgorithm();
        int i = solution.minCostConnectPoints(new int[][]{
                {0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}
        });
        Assertions.assertEquals(20, i);
    }
}