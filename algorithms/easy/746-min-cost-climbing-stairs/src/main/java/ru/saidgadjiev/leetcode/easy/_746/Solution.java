package ru.saidgadjiev.leetcode.easy._746;

/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 * 1,100,1,1,1,100,1,1,100,1
 * 1 1   2 2 3 103 4 5 105 6
 *
 * 10,15,20 30 40 60
 * 10 15 --> 10
 * 10 15 20 --> 15
 * 10 15 20 30 --> 30
 * 10 15 20 30 40 --> 45
 * 10 15 20 30 40 60 --> 70
 */
public class Solution {

    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] = Math.min(cost[i - 1], cost[i - 2]) + cost[i];
        }

        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().minCostClimbingStairs(new int[] {10,15,20,30,40}));
    }
}
