package ru.saidgadjiev.leetcode._212;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a 2D board and a list of words from the dictionary, find all words in the board.
 *
 * Each word must be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.
 *
 *
 *
 * Example:
 *
 * Input:
 * board = [
 *   ['o','a','a','n'],
 *   ['e','t','a','e'],
 *   ['i','h','k','r'],
 *   ['i','f','l','v']
 * ]
 * words = ["oath","pea","eat","rain"]
 *
 * Output: ["eat","oath"]
 *
 *
 * Note:
 *
 * All inputs are consist of lowercase letters a-z.
 * The values of words are distinct.
 */
public class Solution {

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();

        for (String word: words) {
            if (exist(board, word)) {
                result.add(word);
            }
        }

        result.sort(String::compareTo);

        return result;
    }

    private boolean exist(char[][] board, String word) {
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
