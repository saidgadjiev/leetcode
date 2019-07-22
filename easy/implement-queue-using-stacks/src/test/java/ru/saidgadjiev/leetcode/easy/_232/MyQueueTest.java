package ru.saidgadjiev.leetcode.easy._232;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyQueueTest {

    @Test
    public void test() {
        MyQueue myQueue = new MyQueue();

        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        int res1 = myQueue.peek();

        Assertions.assertEquals(res1, 1);
        int res2 = myQueue.pop();

        Assertions.assertEquals(1, res2);

        res1 = myQueue.pop();

        Assertions.assertEquals(res1, 2);
        boolean empty = myQueue.empty();

        Assertions.assertTrue(empty);
    }
}