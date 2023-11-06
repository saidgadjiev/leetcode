package ru.saidgadjiev.leetcode.medium._88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);
        int i1 = 0, i2 = 0, i = 0;
        while (i1 < m && i2 < n) {
            if (nums1Copy[i1] < nums2[i2]) {
                nums1[i] = nums1Copy[i1];
                ++i1;
            } else {
                nums1[i] = nums2[i2];
                ++i2;
            }
            ++i;
        }
        if (i1 < m) {
            for (int j = i1; j < m; j++) {
                nums1[i++] = nums1Copy[j];
            }
        } else {
            for (int j = i2; j < n; j++) {
                nums1[i++] = nums2[j];
            }
        }
    }
}
