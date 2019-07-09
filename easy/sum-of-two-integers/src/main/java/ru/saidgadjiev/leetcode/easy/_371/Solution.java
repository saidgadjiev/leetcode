package ru.saidgadjiev.leetcode.easy._371;

public class Solution {

    public int getSum(int a, int b) {
        StringBuilder resultBits = new StringBuilder();
        int bitA = a & 1;
        int bitB = b & 1;
        int bitSum = bitA + bitB;
        int inMind = 0;

        if (bitSum > 1) {
            bitSum = 0;
            inMind = 1;
        }
        resultBits.append(bitSum);
        int i = 1;

        while (i < 32) {
            a >>= 1;
            b >>= 1;
            bitA = a & 1;
            bitB = b & 1;
            bitSum = bitA + bitB + inMind;

            inMind = 0;
            if (bitSum > 1) {
                bitSum %= 2;
                inMind = 1;
            }

            resultBits.append(bitSum);

            i++;
        }

        return (int) Long.parseLong(resultBits.reverse().toString(), 2);
    }
}
