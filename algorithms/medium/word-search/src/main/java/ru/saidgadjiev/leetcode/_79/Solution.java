package ru.saidgadjiev.leetcode._79;

/**
 * Given a 2D board and a word, find if the word exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 *
 * Example:
 *
 * board =
 * [
 *   ['A','B','C','E'],
 *   ['S','F','C','S'],
 *   ['A','D','E','E']
 * ]
 *
 * Given word = "ABCCED", return true.
 * Given word = "SEE", return true.
 * Given word = "ABCB", return false.
 */
public class Solution {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == word.charAt(0)) {
                    boolean result = exist(board, i, j, word, 0);

                    if (result) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean exist(char[][] board, int i, int j, String word, int nextCharIndex) {
        if (nextCharIndex >= word.length()) {
            return true;
        }
        if (isInvalidSize(board, i, j)) {
            return false;
        }
        if (isInvalidVal(board, i, j, word.charAt(nextCharIndex))) {
            return false;
        }

        char savedChar = board[i][j];

        board[i][j] = '-';
        boolean result = exist(board, i + 1, j, word, nextCharIndex + 1)
                || exist(board, i, j + 1, word, nextCharIndex + 1)
                || exist(board, i - 1, j, word, nextCharIndex + 1)
                || exist(board, i, j - 1, word, nextCharIndex + 1);

        board[i][j] = savedChar;

        return result;
    }

    private boolean isInvalidVal(char[][] board, int i, int j, char validChar) {
        return board[i][j] != validChar;
    }

    private boolean isInvalidSize(char[][] board, int i, int j) {
        if (i >= board.length) {
            return true;
        }
        if (i < 0) {
            return true;
        }
        if (j >= board[0].length) {
            return true;
        }
        if (j < 0) {
            return true;
        }

        return false;
    }
}
