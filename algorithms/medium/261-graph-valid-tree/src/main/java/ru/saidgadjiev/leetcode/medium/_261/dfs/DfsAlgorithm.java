package ru.saidgadjiev.leetcode.medium._261.dfs;

import java.util.*;

public class DfsAlgorithm {

    public boolean validTree(int n, int[][] edges) {
        if (n == 0 || n == 1) {
            return true;
        }
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Stack<Integer> dfs = new Stack<>();
        dfs.push(0);
        Set<Integer> visited = new HashSet<>();

        while (!dfs.isEmpty()) {
            Integer currentNode = dfs.pop();
            if (visited.contains(currentNode)) {
                return false;
            }
            visited.add(currentNode);
            for (Integer node : adj.get(currentNode)) {
                if (!visited.contains(node)) {
                    dfs.push(node);
                }
            }
        }

        return visited.size() == n;
    }
}
