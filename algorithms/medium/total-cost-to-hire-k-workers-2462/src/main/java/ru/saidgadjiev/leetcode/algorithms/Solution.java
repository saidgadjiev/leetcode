package ru.saidgadjiev.leetcode.algorithms;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/total-cost-to-hire-k-workers
 */
public class Solution {

    public long totalCost(int[] costs, int k, int candidates) {
        Queue<Integer> priorityLeftCandidatesQueue = new PriorityQueue<>();
        Queue<Integer> priorityRightCandidatesQueue = new PriorityQueue<>();

        for (int i = 0; i < candidates; ++i) {
            priorityLeftCandidatesQueue.add(costs[i]);
        }

        int iLeft = candidates;
        int iRight = Math.max(iLeft - 1, costs.length - candidates - 1);
        for (int i = costs.length - 1; i > iRight; --i) {
            priorityRightCandidatesQueue.add(costs[i]);
        }

        long result = 0;

        for (int i = 0; i < k; i++) {
            Integer leftMinCostCandidate = priorityLeftCandidatesQueue.peek();
            Integer rightMinCostCandidate = priorityRightCandidatesQueue.peek();

            leftMinCostCandidate = leftMinCostCandidate == null ? Integer.MAX_VALUE : leftMinCostCandidate;
            rightMinCostCandidate = rightMinCostCandidate == null ? Integer.MAX_VALUE : rightMinCostCandidate;

            result += Math.min(leftMinCostCandidate, rightMinCostCandidate);

            if (leftMinCostCandidate <= rightMinCostCandidate) {
                priorityLeftCandidatesQueue.poll();
                if (iLeft <= iRight) {
                    priorityLeftCandidatesQueue.add(costs[iLeft++]);
                }
            } else {
                priorityRightCandidatesQueue.poll();
                if (iRight >= iLeft) {
                    priorityRightCandidatesQueue.add(costs[iRight--]);
                }
            }
        }

        return result;
    }
}
