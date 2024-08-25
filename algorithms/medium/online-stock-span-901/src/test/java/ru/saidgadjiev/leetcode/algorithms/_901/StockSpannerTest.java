package ru.saidgadjiev.leetcode.algorithms._901;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StockSpannerTest {

    @Test
    void case1() {
        StockSpanner stockSpanner = new StockSpanner();
        Assertions.assertEquals(1, stockSpanner.next(100)); // return 1
        Assertions.assertEquals(1, stockSpanner.next(80));  // return 1
        Assertions.assertEquals(1, stockSpanner.next(60));  // return 1
        Assertions.assertEquals(2, stockSpanner.next(70));  // return 2
        Assertions.assertEquals(1, stockSpanner.next(60));  // return 1
        Assertions.assertEquals(4, stockSpanner.next(75));  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
        Assertions.assertEquals(6, stockSpanner.next(85));  // return 6
    }
}
