package ru.saidgadjiev.leetcode.medium._239;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/sliding-window-maximum
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 * Explanation:
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            priorityQueue.offer(nums[i]);
        }

        List<Integer> result = new ArrayList<>();
        result.add(priorityQueue.peek());
        for (int i = k; i < nums.length; i++) {
            priorityQueue.remove(nums[i - k]);
            priorityQueue.offer(nums[i]);
            result.add(priorityQueue.peek());
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
