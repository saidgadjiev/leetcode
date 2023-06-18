package ru.saidgadjiev.leetcode.medium._787.belmanford;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BelmanFordAlgorithmTest {

    @Test
    void case1() {
        BelmanFordAlgorithm belmanFordAlgorithm = new BelmanFordAlgorithm();
        int cheapestPrice = belmanFordAlgorithm.findCheapestPrice(4, new int[][]{
                {0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}
        }, 0, 3, 1);
        Assertions.assertEquals(700, cheapestPrice);
    }
}