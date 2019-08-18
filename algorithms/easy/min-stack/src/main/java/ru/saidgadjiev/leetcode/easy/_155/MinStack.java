package ru.saidgadjiev.leetcode.easy._155;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 *
 * Example:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
public class MinStack {

    private int arrStackSize = 10;

    private int stackSize = 0;

    private int[] stack;

    private int arrMinStackSize = 10;

    private int minStackSize = 0;

    private int[] minStack;

    public MinStack() {
        stack = new int[arrStackSize];
        minStack = new int[arrMinStackSize];
    }

    public void push(int x) {
        if (stackSize == arrStackSize) {
            growStack();
        }
        if (minStackSize == arrMinStackSize) {
            growMinStack();
        }

        stack[stackSize++] = x;

        if (minStackSize == 0) {
            minStack[minStackSize++] = x;
        } else if (x <= minStack[minStackSize - 1]) {
            minStack[minStackSize++] = x;
        }
    }

    public void pop() {
        if (stackSize == 0) {
            throw new EmptyStackException();
        }

        if (top() == minStack[minStackSize - 1]) {
            --minStackSize;
        }
        --stackSize;
    }

    public int top() {
        if (stackSize == 0) {
            throw new EmptyStackException();
        }

        return stack[stackSize - 1];
    }

    public int getMin() {
        if (stackSize == 0) {
            throw new EmptyStackException();
        }

        return minStack[minStackSize - 1];
    }

    private void growStack() {
        arrStackSize *= 2;

        stack = Arrays.copyOf(stack, arrStackSize);
    }

    private void growMinStack() {
        arrMinStackSize *= 2;

        minStack = Arrays.copyOf(minStack, arrMinStackSize);
    }
}
