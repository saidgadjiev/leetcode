package ru.saidgadjiev.leetcode.medium._238;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] l = new int[nums.length];

        l[0] = 1;
        for (int i = 1; i < nums.length; ++i) {
            l[i] = l[i - 1] * nums[i - 1];
        }
        int[] r = new int[nums.length];

        r[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; --i) {
            r[i] = r[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; ++i) {
            nums[i] = l[i] * r[i];
        }

        return nums;
    }
}
