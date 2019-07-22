package ru.saidgadjiev.leetcode.hard._42;

import java.util.Stack;

public class Solution {

    public int trap(int[] height) {
        Stack<Integer> nodeStack = new Stack<>();
        int trap = 0;

        for (int i = 0; i < height.length - 1; ++i) {
            if (height[i] > height[i + 1]) {
                nodeStack.push(i);
            } else if (height[i] < height[i + 1] && !nodeStack.isEmpty()) {
                int peek = nodeStack.peek();

                if (height[peek] < height[i + 1]) {
                    while (!nodeStack.isEmpty() && height[nodeStack.peek()] <= height[i + 1]) {
                        int popI = nodeStack.pop();

                        trap += square(height, popI, i + 1);
                    }
                    if (!nodeStack.isEmpty() && height[nodeStack.peek()] > height[i + 1]) {
                        trap += square(height, i + 1, nodeStack.peek());
                    }
                } else {
                    trap += square(height, i + 1, peek);
                    if (height[peek] == height[i + 1]) {
                        nodeStack.pop();
                    }
                }
            }
        }

        return trap;
    }

    private int square(int[] height, int i1, int i2) {
        if (i1 < i2) {
            int h = height[i1] - height[findHeightIndex(height, i1 + 1, i2 - 1)];

            int w = i2 - i1 - 1;

            return h * w;
        } else {
            int h = height[i1] - height[findHeightIndex(height, i2 + 1, i1 - 1)];

            int w = i1 - i2 - 1;

            return h * w;
        }
    }

    private int findHeightIndex(int[] height, int start, int end) {
        int h = start;

        for (int i = start + 1; i <= end; ++i) {
            if (height[i] > height[h]) {
                h = i;
            }
        }

        return h;
    }
}
