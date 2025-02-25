package ru.saidgadjiev.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                ++i;
            }

            if (current != nums[i]) {
                result.add(current + "->" + nums[i]);
            } else {
                result.add(current + "");
            }
        }

        return result;
    }
}
