package ru.saidgadjiev.leetcode.medium._62;

/**
 * https://leetcode.com/problems/unique-paths
 * 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0
 *
 * 0 1 1 1 1 1 1
 * 1 2 3 4 5 6 7
 * 1 3 6 10 15 21 28
 */
public class Solution {

    public int uniquePaths(int m, int n) {
        int[][]way = new int[m][n];

        for (int i = 0; i < n; i++) {
            way[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            way[i][0] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (way[i][j] == 0) {
                    way[i][j] = way[i - 1][j] + way[i][j - 1];
                }
            }
        }

        return way[way.length - 1][way[0].length - 1];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().uniquePaths(3, 7));
    }
}
