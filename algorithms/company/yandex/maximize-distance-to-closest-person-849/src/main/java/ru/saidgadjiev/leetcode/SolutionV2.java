package ru.saidgadjiev.leetcode;

public class SolutionV2 {

    public int maxDistToClosest(int[] seats) {
        int l = -1, r = 0, max = 0;

        for (; r < seats.length; r++) {
            if (seats[r] == 1) {
                if (l == -1) {
                    max = r;
                } else {
                    max = Math.max(max, (r - l) / 2);
                }
                l = r;
            }
        }

        return Math.max(max, r - l - 1);
    }
}
