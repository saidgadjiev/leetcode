package ru.saidgadjiev.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1 2 3 4 5 6 target = 5
 */
public class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int l = j + 1, r = nums.length - 1;

                while (l < r) {
                    long sum4 = (long) nums[i] + nums[j] + nums[l] + nums[r];

                    if (sum4 == target) {
                        result.add(List.of(nums[i], nums[j], nums[l], nums[r]));

                        while (l < r && nums[l] == nums[l + 1]) {
                            ++l;
                        }
                        while (l < r && nums[r] == nums[r - 1]) {
                            --r;
                        }
                        ++l;
                        --r;
                    } else if (sum4 < target) {
                        ++l;
                    } else {
                        --r;
                    }
                }
            }
        }

        return result;
    }
}
