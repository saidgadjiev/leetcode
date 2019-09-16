package ru.saidgadjiev.leetcode._281;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ZigzagIteratorTest {

    @Test
    public void test() {
        ZigzagIterator zigzagIterator = new ZigzagIterator(Arrays.asList(1), Arrays.asList());

        while (zigzagIterator.hasNext()) {
            System.out.println(zigzagIterator.next());
        }
    }
}