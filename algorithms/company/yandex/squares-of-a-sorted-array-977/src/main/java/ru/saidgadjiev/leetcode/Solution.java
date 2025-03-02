package ru.saidgadjiev.leetcode;

public class Solution {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0, right = nums.length - 1, i = nums.length - 1;
        while (left <= right) {
            if (square(nums[left]) > square(nums[right])) {
                result[i--] = square(nums[left]);
                ++left;
            } else {
                result[i--] = square(nums[right]);
                --right;
            }
        }

        return result;
    }

    private int square(int num) {
        return num * num;
    }
}
