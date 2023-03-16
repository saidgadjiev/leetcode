package ru.saidgadjiev.leetcode.easy._202;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();

        while (numbers.add(n)) {
            int tmp = n;
            int sum = 0;
            while (tmp > 0) {
                int nPart = tmp % 10;
                sum += nPart * nPart;
                tmp = tmp / 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
        }

        return false;
    }
}
