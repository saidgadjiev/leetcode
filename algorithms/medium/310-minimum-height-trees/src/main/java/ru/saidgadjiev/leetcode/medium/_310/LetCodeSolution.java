package ru.saidgadjiev.leetcode.medium._310;

import java.util.*;

public class LetCodeSolution {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n < 2) {
            List<Integer> centroids = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                centroids.add(i);
            }

            return centroids;
        }
        List<Set<Integer>> neighbours = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            neighbours.add(new HashSet<>());
        }
        for (int[] edge : edges) {
            neighbours.get(edge[0]).add(edge[1]);
            neighbours.get(edge[1]).add(edge[0]);
        }

        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (neighbours.get(i).size() == 1) {
                leaves.add(i);
            }
        }

        int remainingNodes = n;
        while (remainingNodes > 2) {
            remainingNodes -= leaves.size();

            List<Integer> newLeaves = new ArrayList<>();
            for (Integer leaf : leaves) {
                int neighbour = neighbours.get(leaf).iterator().next();
                neighbours.get(neighbour).remove(leaf);
                if (neighbours.get(neighbour).size() == 1) {
                    newLeaves.add(neighbour);
                }
            }

            leaves = newLeaves;
        }

        return leaves;
    }
}
