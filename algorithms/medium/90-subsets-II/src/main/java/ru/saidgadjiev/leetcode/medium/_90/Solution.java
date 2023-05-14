package ru.saidgadjiev.leetcode.medium._90;

import java.util.*;

public class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int setBitNumber = (int) Math.pow(2, nums.length);
        for (int i = 0; i < nums.length; i++) {
            setBitNumber *= 2;
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set<String> uniqueSet = new HashSet<>();
        for (int i = 0; i < setBitNumber; i++) {
            StringBuilder bitsStr = new StringBuilder();
            List<Integer> set = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                int mask = 1 << j;
                int isSet = mask & i;
                if (isSet != 0) {
                    set.add(nums[j]);
                    bitsStr.append(nums[j]).append(",");
                }
            }
            if (!uniqueSet.contains(bitsStr.toString())) {
                uniqueSet.add(bitsStr.toString());
                result.add(set);
            }
        }

        return result;
    }

    public List<Integer> applyMask(int[] nums, int nextSetBitNumber) {
        int mask = 1;
        StringBuilder bitsStr = new StringBuilder();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if ((nextSetBitNumber & mask) != 0) {
                result.add(num);
                bitsStr.append("1");
            } else {
                bitsStr.append("0");
            }
            mask <<= 1;
        }
        System.out.println(bitsStr.reverse() + "->>" + result);

        return result;
    }

    public void applyMask(int n, int bits) {
        int mask = 1;

        StringBuilder bitsStr = new StringBuilder();
        for (int i = 0; i < bits; i++) {
            if ((n & mask) != 0) {
                bitsStr.append("1");
            } else {
                bitsStr.append("0");
            }
            mask <<= 1;
        }

        System.out.println(bitsStr.reverse());
    }
}
