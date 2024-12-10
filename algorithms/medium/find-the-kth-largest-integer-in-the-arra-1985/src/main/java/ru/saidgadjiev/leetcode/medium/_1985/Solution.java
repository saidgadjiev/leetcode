package ru.saidgadjiev.leetcode.medium._1985;

import java.util.Arrays;

public class Solution {

    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (o1, o2) -> {
            if (o2.length() != o1.length()) {
                return o2.length() > o1.length() ? 1 : -1;
            }

            for (int i = 0; i < o1.length(); ++i) {
                int o1Num = Character.digit(o1.charAt(i), 10);
                int o2Num = Character.digit(o2.charAt(i), 10);

                if (o2Num != o1Num) {
                    return o2Num > o1Num ? 1 : -1;
                }
            }

            return 0;
        });

        return nums[k - 1];
    }
}
