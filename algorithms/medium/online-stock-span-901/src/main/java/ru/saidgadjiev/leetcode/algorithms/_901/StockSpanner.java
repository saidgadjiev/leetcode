package ru.saidgadjiev.leetcode.algorithms._901;

import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/online-stock-span
 */
class StockSpanner {

    private final Stack<Map.Entry<Integer, Integer>> monotonicStack = new Stack<>();

    public StockSpanner() {

    }

    public int next(int price) {
        int span = 1;

        while (!monotonicStack.empty() && monotonicStack.peek().getKey() <= price) {
            Map.Entry<Integer, Integer> top = monotonicStack.pop();
            span += top.getValue();
        }

        monotonicStack.push(Map.entry(price, span));

        return span;
    }
}
