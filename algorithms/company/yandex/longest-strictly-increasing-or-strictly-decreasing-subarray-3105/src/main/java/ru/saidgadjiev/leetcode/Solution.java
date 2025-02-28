package ru.saidgadjiev.leetcode;

/**
 * Если элементы увеличиваются, то прибавляем увеличение, иначе уменьшение
 * При каждом смене направления сбрасываем противоположный результат на 1
 */
public class Solution {

    public int longestMonotonicSubarray(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int longest = 0;
        int inc = 1, dec = 1;
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] < nums[i + 1]) {
                ++inc; dec = 1;
            } else if (nums[i] > nums[i + 1]) {
                ++dec; inc = 1;
            } else {
                inc = 1; dec = 1;
            }
            longest = Math.max(longest, Math.max(inc, dec));
        }

        return longest;
    }
}
