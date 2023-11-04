package ru.gadjini.leetcode._2215;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return List.of(diff(nums1, nums2), diff(nums2, nums1));
    }

    private List<Integer> diff(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        for (int k : nums1) {
            boolean found = false;
            for (int i : nums2) {
                if (k == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(k);
            }
        }

        return new ArrayList<>(result);
    }
}
