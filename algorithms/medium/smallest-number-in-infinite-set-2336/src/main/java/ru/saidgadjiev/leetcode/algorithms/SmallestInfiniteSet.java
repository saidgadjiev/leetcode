package ru.saidgadjiev.leetcode.algorithms;

import java.util.TreeSet;

/**
 * https://leetcode.com/problems/smallest-number-in-infinite-set
 */
public class SmallestInfiniteSet {

    private int prevSmallest = 1;

    private TreeSet<Integer> infiniteSet = new TreeSet<>();

    public SmallestInfiniteSet() {

    }

    public int popSmallest() {
        if (infiniteSet.isEmpty()) {
            return prevSmallest++;
        }

        return infiniteSet.pollFirst();
    }

    public void addBack(int num) {
        if (num < prevSmallest) {
            infiniteSet.add(num);
        }
    }
}
