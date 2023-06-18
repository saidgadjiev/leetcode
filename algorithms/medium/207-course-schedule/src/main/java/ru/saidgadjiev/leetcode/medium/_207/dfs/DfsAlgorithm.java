package ru.saidgadjiev.leetcode.medium._207.dfs;

import java.util.ArrayList;
import java.util.List;

public class DfsAlgorithm {

    private boolean dfs(int course, List<List<Integer>> adj, boolean[] completedCourses, boolean[] stack) {
        if (stack[course]) {
            return true;
        }
        if (completedCourses[course]) {
            return false;
        }
        completedCourses[course] = true;
        stack[course] = true;
        for (Integer adjCourse : adj.get(course)) {
            if (dfs(adjCourse, adj, completedCourses, stack)) {
                return true;
            }
        }
        stack[course] = false;

        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            adj.get(prerequisite[0]).add(prerequisite[1]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] stack = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (dfs(i, adj, visited, stack)) {
                return false;
            }
        }

        return true;
    }
}
