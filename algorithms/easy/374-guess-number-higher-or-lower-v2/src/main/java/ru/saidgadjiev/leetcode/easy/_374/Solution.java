package ru.saidgadjiev.leetcode.easy._374;

public class Solution extends GuessGame {

    public int guessNumber(int n) {
        int i = 0; int j = n;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            int guess = guess(mid);

            if (guess == 0) {
                return mid;
            } else if (guess < 0) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return -1;
    }
}
