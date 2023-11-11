package ru.gadjini.leetcode._2300;

import java.util.Arrays;

public class Solution {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            int minSuccessIndex = findMinSuccessIndex(spells[i], potions, success);
            result[i] = potions.length - minSuccessIndex;
        }

        return result;
    }

    private int findMinSuccessIndex(int spell, int[] potions, long success) {
        int i = 0; int j = potions.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            long product = (long) spell * potions[mid];
            if (product >= success) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return i;
    }
}
