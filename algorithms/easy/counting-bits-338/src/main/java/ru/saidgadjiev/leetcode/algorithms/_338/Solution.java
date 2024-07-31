package ru.saidgadjiev.leetcode.algorithms._338;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] countBits(int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            result.add(count1Bits(i));
        }

        return result.stream().mapToInt(m -> m).toArray();
    }

    private int count1Bits(int i) {
        int count = 0;

        while (i > 0) {
            if ((i & 1) == 1) {
                ++count;
            }
            i >>= 1;
        }

        return count;
    }
}
