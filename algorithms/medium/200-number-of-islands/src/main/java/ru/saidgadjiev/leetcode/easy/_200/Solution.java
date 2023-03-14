package ru.saidgadjiev.leetcode.easy._200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/number-of-islands/
 *
 * 1. В цикле проходим по массиву ищем где 1
 * 2. Делаем dfs от этой клетки где меняем всем таким клеткам на "2"
 * 3. Увеличиваем счетчик островов на 1 и ищем дальше 1
 * 4. повторяем шаги 2-3
 */
public class Solution {

    public int numIslands(char[][] grid) {
        int numIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    fillIsland(grid, i, j, '2');
                    ++numIslands;
                }
            }
        }

        return numIslands;
    }

    private void fillIsland(char[][] grid, int sr, int sc, char color) {
        char colorToReplace = grid[sr][sc];

        grid[sr][sc] = color;
        List<Integer[]> marked = floodFill4(grid, sr, sc, color, colorToReplace);
        Queue<Integer[]> highsToMarkQueue = new LinkedList<>(marked);

        while (!highsToMarkQueue.isEmpty()) {
            Integer[] srScToMark = highsToMarkQueue.poll();
            marked = floodFill4(grid, srScToMark[0], srScToMark[1], color, colorToReplace);
            highsToMarkQueue.addAll(marked);
        }
    }

    private List<Integer[]> floodFill4(char[][] image, int sr, int sc, char color, char colorToReplace) {
        List<Integer[]> marked = new ArrayList<>();
        if (sr > 0 && image[sr - 1][sc] == colorToReplace) {
            image[sr - 1][sc] = color;
            marked.add(new Integer[] {sr - 1, sc});
        }
        if (sr < image.length - 1 && image[sr + 1][sc] == colorToReplace) {
            image[sr + 1][sc] = color;
            marked.add(new Integer[] {sr + 1, sc});
        }
        if (sc > 0 && image[sr][sc - 1] == colorToReplace) {
            image[sr][sc - 1] = color;
            marked.add(new Integer[] {sr, sc - 1});
        }
        if (sc < image[0].length -1 && image[sr][sc + 1] == colorToReplace) {
            image[sr][sc + 1] = color;
            marked.add(new Integer[] {sr, sc + 1});
        }

        return marked;
    }
}
