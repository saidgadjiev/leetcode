package ru.saidgadjiev.leetcode.medium._137;

/**
 * Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,3,2]
 * Output: 3
 * Example 2:
 *
 * Input: [0,1,0,1,0,1,99]
 * Output: 99
 */
public class Solution {

    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < 32; ++i) {
            int bitSum = 0;

            for (int num: nums) {
                bitSum += (num >> (31 - i)) & 1;
            }
            result += (bitSum % 3) << (31 - i);
        }

        return result;
    }
}
