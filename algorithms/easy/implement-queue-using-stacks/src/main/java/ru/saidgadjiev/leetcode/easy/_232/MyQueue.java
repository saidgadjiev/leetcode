package ru.saidgadjiev.leetcode.easy._232;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> stack;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> tmp = new Stack<>();

        while (!stack.isEmpty()) {
            tmp.push(stack.pop());
        }
        tmp.push(x);

        stack.clear();
        while (!tmp.isEmpty()) {
            stack.push(tmp.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }

    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.empty();
    }
}
