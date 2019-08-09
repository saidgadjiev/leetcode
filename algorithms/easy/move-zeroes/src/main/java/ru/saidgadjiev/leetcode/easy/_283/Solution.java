package ru.saidgadjiev.leetcode.easy._283;

public class Solution {

    public void moveZeroes(int[] nums) {
        int zerosCountAtEnd = 0;

        for (int i = 0; i < nums.length - zerosCountAtEnd; ++i) {
            if (nums[i] == 0) {
                int i1 = i;

                while (i1 < nums.length && nums[i1] == 0) {
                    ++i1;
                }
                if (i1 == nums.length) {
                    break;
                }
                int shift = i1 - i;

                for (int j = i; j < nums.length - shift; ++j) {
                    nums[j] = nums[j + shift];
                }
                for (int j = nums.length - shift; j < nums.length; ++j) {
                    nums[j] = 0;
                }
                zerosCountAtEnd += shift;
            }
        }
    }
}
