package ru.saidgadjiev.leetcode.medium._329.dfs;

import java.util.HashMap;
import java.util.Map;

public class DfsAlgorithm {

    private static final int[][] DIRS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    private Integer[][] memo;

    public int longestIncreasingPath(int[][] matrix) {
        memo = new Integer[matrix.length][matrix[0].length];

        int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans = Math.max(ans, dfs(matrix, i, j));
            }
        }

        return ans;
    }

    private int dfs(int[][] matrix, int i, int j) {
        if (memo[i][j] != null) {
            return memo[i][j];
        }

        int ans = 0;
        for (int[] dir : DIRS) {
            int x = i + dir[0];
            int y = j + dir[1];
            if (x >= 0 && y >= 0 && x < matrix.length && y < matrix[0].length
                    && matrix[x][y] < matrix[i][j]) {
                ans = Math.max(ans, dfs(matrix, x, y));
            }
        }

        ++ans;
        memo[i][j] = ans;

        return ans;
    }
}
