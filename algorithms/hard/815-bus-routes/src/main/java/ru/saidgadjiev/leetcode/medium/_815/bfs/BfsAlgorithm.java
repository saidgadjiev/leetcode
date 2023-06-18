package ru.saidgadjiev.leetcode.medium._815.bfs;

import java.util.*;

public class BfsAlgorithm {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            return 0;
        }
        List<List<Integer>> graph = new ArrayList<>();

        for (int[] route : routes) {
            Arrays.sort(route);
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < routes.length; i++) {
            for (int j = i + 1; j < routes.length; j++) {
                if (isConnected(routes[i], routes[j])) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        Queue<int[]> bfs = new LinkedList<>();
        List<Integer> targetRoutes = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < graph.size(); i++) {
            if (Arrays.binarySearch(routes[i], source) >= 0) {
                bfs.offer(new int[] {i, 0});
                visited.add(i);
            }
            if (Arrays.binarySearch(routes[i], target) >= 0) {
                targetRoutes.add(i);
            }
        }

        while (!bfs.isEmpty()) {
            int[] nextRoute = bfs.poll();
            if (targetRoutes.contains(nextRoute[0])) {
                return nextRoute[1] + 1;
            }

            for (Integer route : graph.get(nextRoute[0])) {
                if (!visited.contains(route)) {
                    visited.add(route);
                    bfs.offer(new int[] {route, nextRoute[1] + 1});
                }
            }
        }

        return -1;
    }

    private boolean isConnected(int[] routes1, int[] routes2) {
        int i = 0, j = 0;
        while (i < routes1.length && j < routes2.length) {
            if (routes1[i] == routes2[j]) return true;
            if (routes1[i] < routes2[j]) i++; else j++;
        }
        return false;
    }
}
