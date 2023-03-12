package ru.saidgadjiev.leetcode.medium._70;

/**
 * https://leetcode.com/problems/climbing-stairs/
 * Что мы имеем:
 * - можем идти 1 ступеньку или 2
 *
 * Сколько уникальных путей достичь n?
 * 3
 * 1 1 1
 * 1 2
 * 2 1
 *
 * 10
 * 1 - 1(1)
 * 2 - 2((1,1),(2))
 * 3 - 3((1,1,1),(1,2),(2,1))
 * 4 - 5((1,1,1,1),(1,1,2),(2,1,1)(1,2,1)(2,2))
 * 5 -
 */
public class Solution {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int i0 = 1;
        int i1 = 2;

        for (int i = 2; i < n; i++) {
            int tmp = i0 + i1;
            i0 = i1;
            i1 = tmp;
        }

        return i1;
    }

    public static void main(String[] args) {
        int i = new Solution().climbStairs(4);
        System.out.println(i);
    }
}
