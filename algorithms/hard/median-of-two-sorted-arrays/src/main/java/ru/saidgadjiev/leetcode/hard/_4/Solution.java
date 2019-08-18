package ru.saidgadjiev.leetcode.hard._4;

import java.util.ArrayList;
import java.util.List;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 * Example 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 * Example 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merge = merge(nums1, nums2);

        if (merge.size() % 2 == 1) {
            return merge.get(merge.size() / 2);
        }
        int center = merge.size() / 2;

        return (merge.get(center) + merge.get(center - 1)) / 2f;
    }

    private List<Integer> merge(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                result.add(nums1[i++]);
            } else {
                result.add(nums2[j++]);
            }
        }

        while (i < nums1.length) {
            result.add(nums1[i++]);
        }

        while (j < nums2.length) {
            result.add(nums2[j++]);
        }

        return result;
    }
}
