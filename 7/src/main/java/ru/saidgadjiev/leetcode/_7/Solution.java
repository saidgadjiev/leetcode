package ru.saidgadjiev.leetcode._7;

public class Solution {

    public int reverse(int x) {
        int c = x / 10, d = x % 10;
        int times = times(x);
        int result = d * times;

        while (c != 0) {
            d = c % 10;
            c /= 10;
            times /= 10;

            result += d * times;
        }

        return result;
    }

    private int times(int x) {
        int result = 1;
        int c = x / 10;

        while (c != 0) {
            c /= 10;

            result *= 10;
        }

        return result;
    }

    private int power(int x, int power) {
        int p = x;

        for (int i = 1; i < power; ++i) {
            p *= x;
        }

        return p;
    }
}
