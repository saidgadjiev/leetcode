package ru.saidgadjiev.leetcode.easy._190;

public class Solution {

    public int reverseBits(int n) {
        StringBuilder builder = new StringBuilder();

        builder.append(n & 1);
        int i = 1;
        while (i < 32) {
            n >>= 1;

            builder.append(n & 1);
            ++i;
        }
        long result = Long.parseLong(builder.toString(), 2);

        return (int) result;
    }
}
