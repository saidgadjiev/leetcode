package ru.saidgadjiev.leetcode.algorithms._372;

/**
 * https://leetcode.com/problems/super-pow/
 */
public class Solution {

    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        int res = pow2(a, b[0]) % MOD;
        for (int i = 1; i < b.length; i++) {
            res = pow2(res, 10) % MOD * pow2(a, b[i]) % MOD;
        }

        return res;
    }

    private int pow2(int a, int b) {
        int res = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                res *= a % MOD;
                res %= MOD;
            }
            b >>= 1;
            a *= a % MOD;
            a %= MOD;
        }

        return res;
    }

    private int pow(int a, int b) {
        int res = 1;

        for (int i = 0; i < b; i++) {
            res *= a % MOD;
            res %= MOD;
        }

        return res;
    }
}
