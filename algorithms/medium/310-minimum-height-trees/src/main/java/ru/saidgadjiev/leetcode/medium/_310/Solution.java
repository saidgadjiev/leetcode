package ru.saidgadjiev.leetcode.medium._310;

import java.util.*;

public class Solution {

    private int minHeight = Integer.MAX_VALUE;

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (edges.length == 0) {
            return List.of(0);
        }
        Map<Integer, List<Integer>> connections = new HashMap<>();

        for (int[] edge : edges) {
            connections.putIfAbsent(edge[0], new ArrayList<>());
            connections.get(edge[0]).add(edge[1]);
            connections.putIfAbsent(edge[1], new ArrayList<>());
            connections.get(edge[1]).add(edge[0]);
        }

        Map<Integer, List<Integer>> result = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> visitedLevels = new HashSet<>();
            height(i, new HashSet<>(), connections, 0, visitedLevels);
            minHeight = Math.min(minHeight, visitedLevels.size());
            result.putIfAbsent(visitedLevels.size(), new ArrayList<>());
            result.get(visitedLevels.size()).add(i);
        }

        return result.get(minHeight);
    }

    private void height(int rootNode, Set<Integer> visited,
                        Map<Integer, List<Integer>> connections, int level, Set<Integer> visitedLevels) {
        visited.add(rootNode);
        visitedLevels.add(level);
        for (Integer integer : connections.get(rootNode)) {
            if (!visited.contains(integer)) {
                height(integer, visited, connections, level + 1, visitedLevels);
                if (visitedLevels.size() > minHeight) {
                    break;
                }
            }
        }
    }
}
