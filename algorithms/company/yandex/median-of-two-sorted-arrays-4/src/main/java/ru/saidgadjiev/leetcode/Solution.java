package ru.saidgadjiev.leetcode;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int m1 = 0, m2 = 0;

        for (int i = 0, j = 0, k = 0; k <= (n1 + n2) / 2; ++k) {
            m2 = m1;
            if (i < n1 && j < n2) {
                if (nums1[i] <= nums2[j]) {
                    m1 = nums1[i++];
                } else {
                    m1 = nums2[j++];
                }
            } else if (i < n1) {
                m1 = nums1[i++];
            } else {
                m1 = nums2[j++];
            }
        }

        if ((n1 + n2) % 2 == 0) {
            return (double) (m1 + m2) / 2;
        }

        return m1;
    }
}
