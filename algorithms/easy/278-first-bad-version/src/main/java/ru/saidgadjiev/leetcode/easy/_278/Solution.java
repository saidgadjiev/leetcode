package ru.saidgadjiev.leetcode.easy._278;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long left = 0;
        long right = n;

        long lastBadVersion = -1;
        while (left <= right) {
            long mid = (left + right) / 2;
            boolean midVersionStatus = isBadVersion((int) mid);
            if (midVersionStatus) {
                lastBadVersion = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return (int) lastBadVersion;
    }

    public static void main(String[] args) {
        int i = new Solution().firstBadVersion(16);
        System.out.println(i);
    }
}
