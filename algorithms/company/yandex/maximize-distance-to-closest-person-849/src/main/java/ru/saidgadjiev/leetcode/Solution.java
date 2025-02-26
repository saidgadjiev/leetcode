package ru.saidgadjiev.leetcode;

public class Solution {

    public int maxDistToClosest(int[] seats) {
        int[] distArr = new int[seats.length];

        Integer leftSitting = null;
        for (int i = 0; i < seats.length; i++) {
            int dist = Integer.MAX_VALUE;

            if (seats[i] == 1) {
                leftSitting = i;
            } else if (leftSitting != null) {
                dist = i - leftSitting;
            }
            distArr[i] = dist;
        }

        Integer rightSitting = null;
        for (int i = seats.length - 1; i >= 0; i--) {
            int dist = Integer.MAX_VALUE;

            if (seats[i] == 1) {
                rightSitting = i;
            } else if (rightSitting != null) {
                dist = rightSitting - i;
            }
            distArr[i] = Math.min(distArr[i], dist);
        }

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < distArr.length; i++) {
            if (seats[i] != 1) {
                result = Math.max(result, distArr[i]);
            }
        }

        return result;
    }
}
