package ru.saidgadjiev.leetcode.easy._278;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 1, j = n;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            boolean isBad = isBadVersion(mid);
            if (isBad) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return i;
    }
}
