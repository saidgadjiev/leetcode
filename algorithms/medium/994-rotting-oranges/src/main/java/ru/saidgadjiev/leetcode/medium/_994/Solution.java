package ru.saidgadjiev.leetcode.medium._994;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public int orangesRotting(int[][] grid) {
        List<Integer[]> startPoints = new ArrayList<>();
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 2) {
                    startPoints.add(new Integer[] {r ,c});
                }
            }
        }
        int result = rotting(grid, startPoints);
        for (int[] r : grid) {
            for (int c = 0; c < grid[0].length; c++) {
                if (r[c] == 1) {
                    return -1;
                }
            }
        }

        return result;
    }

    private int rotting(int[][] grid, List<Integer[]> startPoints) {
        int result = 0;

        Queue<Integer[]> marked = new LinkedList<>(startPoints);

        while (!marked.isEmpty()) {
            List<Integer[]> nextMarked = new ArrayList<>();
            while (!marked.isEmpty()) {
                Integer[] integers = marked.poll();
                nextMarked.addAll(rotting(grid, integers[0], integers[1]));
            }
            marked.addAll(nextMarked);
            if (!nextMarked.isEmpty()) {
                ++result;
            }
        }

        return result;
    }

    private List<Integer[]> rotting(int[][] grid, int sr, int sc) {
        List<Integer[]> marked = new ArrayList<>();
        if (sr > 0 && grid[sr - 1][sc] == 1) {
            grid[sr - 1][sc] = 2;
            marked.add(new Integer[]{sr - 1, sc});
        }
        if (sr < grid.length - 1 && grid[sr + 1][sc] == 1) {
            grid[sr + 1][sc] = 2;
            marked.add(new Integer[]{sr + 1, sc});
        }
        if (sc > 0 && grid[sr][sc - 1] == 1) {
            grid[sr][sc - 1] = 2;
            marked.add(new Integer[]{sr, sc - 1});
        }
        if (sc < grid[0].length - 1 && grid[sr][sc + 1] == 1) {
            grid[sr][sc + 1] = 2;
            marked.add(new Integer[]{sr, sc + 1});
        }

        return marked;
    }
}
