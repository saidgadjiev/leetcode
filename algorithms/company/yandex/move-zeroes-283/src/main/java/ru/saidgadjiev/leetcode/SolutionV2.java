package ru.saidgadjiev.leetcode;

public class SolutionV2 {

    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[i];
                nums[i] = tmp;
                nonZeroIndex++;
            }
        }
    }
}
