package ru.saidgadjiev.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Помечать посещенные нужно сразу после добавления в queue иначе он будет посещать уже добавленные в queue
 * и упадет по Time limit
 * Интересный момент с массивом direction
 */
public class Solution {

    public int numIslands(char[][] grid) {
        int result = 0, rows = grid.length, cols = grid[0].length;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    ++result;
                    markIsland(grid, i, j, rows, cols);
                }
            }
        }

        return result;
    }

    private void markIsland(char[][] grid, int i, int j, int rows, int cols) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        grid[i][j] = '2';

        int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!q.isEmpty()) {
            int[] island = q.poll();
            i = island[0];
            j = island[1];

            for (int[] direction : directions) {
                int di = i + direction[0], dj = j + direction[1];
                if (di >= 0 && di < rows && dj >= 0 && dj < cols && grid[di][dj] == '1') {
                    grid[di][dj] = '2';
                    q.add(new int[]{di, dj});
                }
            }
        }
    }
}
