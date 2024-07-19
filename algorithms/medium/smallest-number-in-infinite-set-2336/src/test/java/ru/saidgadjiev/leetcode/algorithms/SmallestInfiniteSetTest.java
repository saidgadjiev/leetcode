package ru.saidgadjiev.leetcode.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallestInfiniteSetTest {

    @Test
    void case1() {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        smallestInfiniteSet.addBack(2);

        int smallest = smallestInfiniteSet.popSmallest();
        Assertions.assertEquals(1, smallest);

        smallest = smallestInfiniteSet.popSmallest();
        Assertions.assertEquals(smallest, 2);

        smallest = smallestInfiniteSet.popSmallest();
        Assertions.assertEquals(smallest, 3);

        smallestInfiniteSet.addBack(1);
        smallest = smallestInfiniteSet.popSmallest();
        Assertions.assertEquals(smallest, 1);

        smallest = smallestInfiniteSet.popSmallest();
        Assertions.assertEquals(smallest, 4);

        smallest = smallestInfiniteSet.popSmallest();
        Assertions.assertEquals(smallest, 5);
    }
}
