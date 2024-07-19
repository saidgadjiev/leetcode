package ru.saidgadjiev.leetcode.algorithms;

import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/maximum-subsequence-score
 */
public class Solution {

    public long maxScore(int[] a, int[] b, int k) {
        int n = a.length;
        Map.Entry<Integer, Integer>[] pairs = new Map.Entry[n];
        for (int i = 0; i < n; ++i) pairs[i] = Map.entry(a[i], b[i]);
        Arrays.sort(pairs, (x, y) -> y.getValue() - x.getValue());
        Queue<Integer> q = new PriorityQueue<>(k + 1);
        long res = 0, sum = 0;
        for (var p : pairs) {
            q.add(p.getKey());
            sum += p.getKey();
            if (q.size() > k) sum -= q.poll();
            if (q.size() == k) res = Math.max(res, sum * p.getValue());
        }
        return res;
    }
}
