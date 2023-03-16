package ru.saidgadjiev.leetcode.easy._1706;

/**
 * https://leetcode.com/problems/where-will-the-ball-fall/
 * { 1,  1,  1, -1, -1},
 * { 1,  1,  1, -1, -1},
 * {-1, -1, -1,  1,  1},
 * { 1,  1,  1,  1, -1},
 * {-1, -1, -1, -1, -1}
 * <p>
 * { 1,  1,  1, -1, -1},
 * { 1,  1,  1, -1, -1},
 * {-1, -1, -1,  1,  1},
 * { 1,  1,  1,  1, -1},
 * {-2,  0,  1,  2,  3}
 * <p>
 * { 1, -1, -1, -1, -1},
 * { 0,  1, -1, -1, -1},
 * {-1,  0,  1, -1, -1},
 * { 0,  1,  2, -1, -1},
 * {-1,  0,  1,  2,  3}
 */
public class Solution {

    public int[] findBall(int[][] grid) {
        int[][] result = new int[grid.length][grid[0].length];

        for (int i = grid.length - 1; i >= 0; i--) {
            fillRow(grid, result, i);
        }

        return result[0];
    }

    private void fillRow(int[][] grid, int[][] result, int row) {
        int lastCol = grid[0].length - 1;

        for (int j = 1; j < lastCol; j++) {
            if (grid[row][j] == -1 && grid[row][j - 1] == -1) {
                result[row][j] = row < grid.length - 1 ? result[row + 1][j - 1] : j - 1;
            } else if (grid[row][j] == 1 && grid[row][j + 1] == 1) {
                result[row][j] = row < grid.length - 1 ? result[row + 1][j + 1] : j + 1;
            } else {
                result[row][j] = -1;
            }
        }
        result[row][0] = -1;
        result[row][lastCol] = -1;
        if (grid[0].length > 1) {
            if (grid[row][0] == 1 && grid[row][1] == 1) {
                result[row][0] = row < grid.length - 1 ? result[row + 1][1] : 1;
            }
            if (grid[row][lastCol] == -1 && grid[row][lastCol - 1] == -1) {
                result[row][lastCol] = row < grid.length - 1 ? result[row + 1][lastCol - 1] : lastCol - 1;
            }
        }
    }
}
