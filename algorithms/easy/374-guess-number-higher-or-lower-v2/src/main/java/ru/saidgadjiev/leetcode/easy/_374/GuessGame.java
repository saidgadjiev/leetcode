package ru.saidgadjiev.leetcode.easy._374;

public class GuessGame {

    public static final int PICK = 5;

    protected int guess(int num) {
        if (num > PICK) {
            return -1;
        }
        if (num < PICK) {
            return 1;
        }
        return 0;
    }
}
