package ru.saidgadjiev.leetcode.easy._169;

public class Solution {

    public int majorityElement(int[] nums) {
        int result = 0;
        int counter = 0;

        for (int num: nums) {
            if (counter == 0) {
                counter = 1;
                result = num;
            } else if (result == num) {
                ++counter;
            } else {
                --counter;
            }
        }

        return result;
    }

    public int bitMajorityElement(int[] nums) {
        int[] bit = new int[32];

        for (int num: nums) {
            for (int i = 0; i < 32; ++i) {
                if (((num >> 31 - i) & 1) == 1) {
                    ++bit[i];
                }
            }
        }
        int result = 0;

        for (int i = 0; i < 32; ++i) {
            if (bit[i] > nums.length / 2) {
                result += 1 << (31 - i);
            }
        }

        return result;
    }
}
