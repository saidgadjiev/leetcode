package ru.saidgadjiev.leetcode.easy._121;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class Solution {
    public int maxProfit(int[] prices) {
       if (prices.length == 0) {
           return 0;
       }
       int maxProfit = 0;
       int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }
}
