package ru.saidgadjiev.leetcode.medium._361;

/**
 * Given a 2D grid, each cell is either a wall 'W', an enemy 'E' or empty '0' (the number zero), return the maximum enemies you can kill using one bomb.
 * The bomb kills all the enemies in the same row and column from the planted point until it hits the wall since the wall is too strong to be destroyed.
 * Note: You can only put the bomb at an empty cell.
 * <p>
 * Example:
 * <p>
 * Input: [["0","E","0","0"],["E","0","W","E"],["0","E","0","0"]]
 * Output: 3
 * Explanation: For the given grid,
 * <p>
 * 0 E 0 0
 * E 0 W E
 * 0 E 0 0
 * <p>
 * Placing a bomb at (1,1) kills 3 enemies.
 * <p>
 * 0,0 2
 * 0,2 1
 * 0,3 1
 * 1,1 3
 * 2,0 2
 * 2,2 1
 * 2,3 2
 */
public class Solution {

    public int maxKilledEnemies(char[][] grid) {
        int n = grid.length;

        if (n == 0) {
            return 0;
        }
        int m = grid[0].length;

        if (m == 0) {
            return 0;
        }
        int[][] leftEnemies = new int[grid.length][grid[0].length];
        int[][] rightEnemies = new int[grid.length][grid[0].length];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (j == 0) {
                    leftEnemies[i][j] = grid[i][j] == 'E' ? 1 : 0;
                } else if (grid[i][j] == 'E') {
                    leftEnemies[i][j] = leftEnemies[i][j - 1] + 1;
                } else if (grid[i][j] == 'W') {
                    leftEnemies[i][j] = 0;
                } else {
                    leftEnemies[i][j] = leftEnemies[i][j - 1];
                }
            }
            for (int j = m - 1; j >= 0; --j) {
                if (j == m - 1) {
                    rightEnemies[i][j] = grid[i][j] == 'E' ? 1 : 0;
                } else if (grid[i][j] == 'E') {
                    rightEnemies[i][j] = rightEnemies[i][j + 1] + 1;
                } else if (grid[i][j] == 'W') {
                    rightEnemies[i][j] = 0;
                } else {
                    rightEnemies[i][j] = rightEnemies[i][j + 1];
                }
            }
        }

        int[][] upEnemies = new int[grid.length][grid[0].length];
        int[][] downEnemies = new int[grid.length][grid[0].length];

        for (int j = 0; j < m; ++j) {
            for (int i = 0; i < n; ++i) {
                if (i == 0) {
                    upEnemies[i][j] = grid[i][j] == 'E' ? 1 : 0;
                } else if (grid[i][j] == 'E') {
                    upEnemies[i][j] = upEnemies[i - 1][j] + 1;
                } else if (grid[i][j] == 'W') {
                    upEnemies[i][j] = 0;
                } else {
                    upEnemies[i][j] = upEnemies[i - 1][j];
                }
            }
            for (int i = n - 1; i >= 0; --i) {
                if (i == n - 1) {
                    downEnemies[i][j] = grid[i][j] == 'E' ? 1 : 0;
                } else if (grid[i][j] == 'E') {
                    downEnemies[i][j] = downEnemies[i + 1][j] + 1;
                } else if (grid[i][j] == 'W') {
                    downEnemies[i][j] = 0;
                } else {
                    downEnemies[i][j] = downEnemies[i + 1][j];
                }
            }
        }

        int max = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (grid[i][j] == '0') {
                    int summary = leftEnemies[i][j] + rightEnemies[i][j] + upEnemies[i][j] + downEnemies[i][j];

                    if (summary > max) {
                        max = summary;
                    }
                }
            }
        }

        return max;
    }
}
