package ru.saidgadjiev.leetcode._281;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagIterator {

    private Queue<Integer> queue = new LinkedList<>();

    private List<Integer> v1;

    private List<Integer> v2;

    private int cursor;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        this.v1 = v1;
        this.v2 = v2;
        addFirstItemsToQueue();
    }

    public int next() {
        if (cursor < v1.size()) {
            queue.add(v1.get(cursor));
        }
        if (cursor < v2.size()) {
            queue.add(v2.get(cursor));
        }
        ++cursor;

        return queue.poll();
    }

    public boolean hasNext() {
        return queue.size() > 0;
    }

    private void addFirstItemsToQueue() {
        if (v1.size() > 0) {
            queue.add(v1.get(cursor));
        }
        if (v2.size() > 0) {
            queue.add(v2.get(cursor));
        }
        ++cursor;
    }
}