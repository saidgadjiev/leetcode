package ru.saidgadjiev.leetcode.easy._1539;

public class Solution {

    public int findKthPositive(int[] arr, int k) {
        int l = 0;
        int r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] - mid - 1 >= k) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l + k;
    }
}
