package ru.saidgadjiev.leetcode.medium._191;

public class Solution2 {

    public int hammingWeight(int n) {
        return hammingWeight(n, 0, 31);
    }

    public int hammingWeight(int n, int low, int high) {
        if (low + 1 == high) {
            return n & 1;
        }
        int mid = low + (high - low) / 2;

        int sum = 0;
        sum += hammingWeight(n >> mid, 0, high - mid);
        sum += hammingWeight(n % (1 << mid), 0, mid);

        return sum;
    }
}
