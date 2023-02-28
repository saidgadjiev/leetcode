package ru.saidgadjiev.leetcode.medium._289;

/**
 * According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
 *
 * Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
 *
 * Any live cell with fewer than two live neighbors dies, as if caused by under-population.
 * Any live cell with two or three live neighbors lives on to the next generation.
 * Any live cell with more than three live neighbors dies, as if by over-population..
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * Write a function to compute the next state (after one update) of the board given its current state. The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously.
 *
 * Example:
 *
 * Input:
 * [
 *   [0,1,0],
 *   [0,0,1],
 *   [1,1,1],
 *   [0,0,0]
 * ]
 * Output:
 * [
 *   [0,0,0],
 *   [1,0,1],
 *   [0,1,1],
 *   [0,1,0]
 * ]
 * Follow up:
 *
 * Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.
 * In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?
 */
public class Solution {

    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == 1 && liveNeighbors(i, j, board) < 2) {
                    board[i][j] = -1;
                }
                if (board[i][j] == 1 && liveNeighbors(i, j, board) > 3) {
                    board[i][j] = -1;
                }
                if (board[i][j] == 0 && liveNeighbors(i, j, board) == 3) {
                    board[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == -1) {
                    board[i][j] = 0;
                } else if (board[i][j] == 2) {
                    board[i][j] = 1;
                }
            }
        }
    }

    private int liveNeighbors(int i, int j, int[][] board) {
        int startI = (i == 0) ? i : i - 1;
        int startJ = (j == 0) ? j : j - 1;
        int endI =   (i == board.length - 1) ? i : i + 1;
        int endJ =   (j == board[0].length - 1) ? j : j + 1;
        int liveNeighbors = 0;

        for (int p = startI; p <= endI; ++p) {
            for (int q = startJ; q <= endJ; ++q) {
                if (p == i && q == j) {
                    continue;
                }
                if (board[p][q] == -1 || board[p][q] == 1) {
                    ++liveNeighbors;
                }
            }
        }

        return liveNeighbors;
    }
}
