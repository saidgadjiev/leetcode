package ru.saidgadjiev.leetcode.easy._1046;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/last-stone-weight
 * [2,7,4,1,8,1]
 * [8,7,4,2,1,1]
 *
 * 8 7
 *
 */
public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            queue.offer(stone);
        }
        while (queue.size() > 1) {
            int i1 = queue.poll();
            int i2 = queue.poll();
            if (i1 != i2) {
                queue.offer(i1 - i2);
            }
        }

        return queue.isEmpty() ? 0 : queue.poll();
    }
}
