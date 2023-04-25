package ru.saidgadjiev.leetcode.medium._417;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pacific-atlantic-water-flow/
 *                 {1, 2, 2, 3, 5},
 *                 {3, 2, 3, 4, 4},
 *                 {2, 4, 5, 3, 1},
 *                 {6, 7, 1, 4, 5},
 *                 {5, 1, 1, 2, 4}
 *
 *                 {t, 2, 2, 3, 5},
 *                 {3, 2, 3, 4, 4},
 *                 {2, 4, 5, 3, 1},
 *                 {6, 7, 1, 4, 5},
 *                 {5, 1, 1, 2, 4}
 *
 *                 {t, 2, 2, 3, 5},
 *                 {3, 2, 3, 4, 4},
 *                 {2, 4, 5, 3, 1},
 *                 {6, 7, 1, 4, 5},
 *                 {5, 1, 1, 2, 4}
 *
 * Начинаем с клетки 0 0
 * Раскрашиваем 0 1 и 1 0 при условии, что, либо правая клетка >= нашей либо левая, либо верхняя, либо нижняя
 * или мы находимся на границе с океаном
 */
public class Solution {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        boolean[][] pacific = new boolean[heights.length][heights[0].length];
        boolean[][] atlantic = new boolean[heights.length][heights[0].length];

        dfs(0, 0, 0, 0, 0, 0, heights, pacific);
        dfs(heights.length - 1, heights[0].length - 1, heights.length - 1,
                heights[0].length - 1, heights.length - 1, heights[0].length - 1, heights, atlantic);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                if (atlantic[i][j] && pacific[i][j]) {
                    result.add(List.of(i, j));
                }
            }
        }

        return result;
    }

    public void dfs(int prevI, int prevJ, int newI, int newJ, int borderI, int borderJ,
                    int[][] matrix, boolean[][] flow) {
        if (newI < 0 || newJ < 0 || newI >= matrix.length || newJ >= matrix[0].length) {
            return;
        }
        if (newI != borderI && newJ != borderJ
                && matrix[newI][newJ] < matrix[prevI][prevJ]) {
            return;
        }
        if (flow[newI][newJ]) {
            return;
        }
        flow[newI][newJ] = true;
        int[][]dir = new int[][] {{0,-1},{0,1},{-1,0},{1,0}};
        for (int[] d : dir) {
            dfs(newI, newJ, newI + d[0], newJ + d[1], borderI, borderJ, matrix, flow);
        }
    }
}
