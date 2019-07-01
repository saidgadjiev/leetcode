package ru.saidgadjiev.leetcode.medium._36;

import java.util.HashSet;
import java.util.Set;

/**
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 *
 * A partially filled sudoku which is valid.
 *
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * Example 1:
 *
 * Input:
 * [
 *   ["5","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * Output: true
 * Example 2:
 *
 * Input:
 * [
 *   ["8","3",".",".","7",".",".",".","."],
 *   ["6",".",".","1","9","5",".",".","."],
 *   [".","9","8",".",".",".",".","6","."],
 *   ["8",".",".",".","6",".",".",".","3"],
 *   ["4",".",".","8",".","3",".",".","1"],
 *   ["7",".",".",".","2",".",".",".","6"],
 *   [".","6",".",".",".",".","2","8","."],
 *   [".",".",".","4","1","9",".",".","5"],
 *   [".",".",".",".","8",".",".","7","9"]
 * ]
 * Output: false
 * Explanation: Same as Example 1, except with the 5 in the top left corner being
 *     modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 * Note:
 *
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * The given board contain only digits 1-9 and the character '.'.
 * The given board size is always 9x9.
 */
public class Solution {

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; ++i) {
            if (!isValidRow(board, i)) {
                return false;
            }
            if (!isValidCol(board, i)) {
                return false;
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidBlock(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValidRow(char[][] board, int row) {
        Set<Character> values = new HashSet<>();

        for (int j = 0; j < 9; ++j) {
            if (board[row][j] == '.') {
                continue;
            }
            if (!values.add(board[row][j])) {
                return false;
            }
        }

        return true;
    }

    private boolean isValidCol(char[][] board, int col) {
        Set<Character> values = new HashSet<>();

        for (int i = 0; i < 9; ++i) {
            if (board[i][col] == '.') {
                continue;
            }
            if (!values.add(board[i][col])) {
                return false;
            }
        }

        return true;
    }

    private boolean isValidBlock(char[][] board, int row, int col) {
        Set<Character> values = new HashSet<>();

        for (int i = row; i < row + 3; ++i) {
            for (int j = col; j < col + 3; ++j) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (!values.add(board[i][j])) {
                    return false;
                }
            }
        }

        return true;
    }
}
