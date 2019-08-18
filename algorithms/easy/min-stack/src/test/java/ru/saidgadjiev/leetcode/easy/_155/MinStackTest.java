package ru.saidgadjiev.leetcode.easy._155;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    @Test
    void push() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        Assertions.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assertions.assertEquals(0, minStack.top());
        Assertions.assertEquals(-2, minStack.getMin());
    }
}