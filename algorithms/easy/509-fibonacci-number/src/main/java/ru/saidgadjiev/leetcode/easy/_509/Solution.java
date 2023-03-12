package ru.saidgadjiev.leetcode.easy._509;

/**
 * https://leetcode.com/problems/fibonacci-number/
 * 4
 * 0 1 1 2 3
 *
 * 4
 * 0
 * 0 1
 *
 * 1
 * 1 1
 *
 * 2
 * 1 2
 *
 * 3
 * 2 3
 */
public class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fib0 = 0;
        int fib1 = 1;
        for (int i = 2; i < n; i++) {
            int tmp = fib1 + fib0;
            fib0 = fib1;
            fib1 = tmp;
        }

        return fib1 + fib0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().fib(3));
    }
}
