package ru.saidgadjiev.leetcode.medium._1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum
 * <p>
 * 2,7,11,15
 * map
 * 2 -> 0
 * 9 - 7 = 2 contains return get(2), i
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (map.containsKey(remainder)) {
                return new int[]{map.get(remainder), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{3, 2,4}, 6)));
    }
}
