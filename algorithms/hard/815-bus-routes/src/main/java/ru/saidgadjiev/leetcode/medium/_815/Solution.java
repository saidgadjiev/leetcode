package ru.saidgadjiev.leetcode.medium._815;

import java.util.*;

/**
 * https://leetcode.com/problems/bus-routes/
 * {1, 2, 7},
 * {3, 6, 7}
 * <p>
 * {7, {0,1}}
 * {6, {1}}
 * {3, {1}}
 * {2, {0}}
 * {1, {0}}
 * <p>
 * {3,7}
 * <p>
 * {7, 12},
 * {4, 5, 15},
 * {6},
 * {15, 19},
 * {9, 12, 13}
 * <p>
 * {7, {0}}
 * {12, {0,4}}
 * {4, {1}}
 * {5, {1}}
 * {15, {1, 3}}
 * {6, {2}}
 * {19, {3}}
 * {9, {4}}
 * {13, {4}}
 * <p>
 * 15 12
 * <p>
 * Смотрим какой автобус может довести нас до 15 получается {1, 3}
 * min = -1;
 * Цикл i по {1,3}:
 * Смотрим какие есть остановки кроме target у автобуса i
 * Смотрим есть ли среди них source если есть значит путь найден если нет то
 * Цикл j по всем остановкам кроме target автобуса i:
 * Повторяем все с самого начала только для остановки j
 */
public class Solution {

    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            return 0;
        }
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < routes.length; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < routes.length; i++) {
            for (int j = i + 1; j < routes.length; j++) {
                if (isIntersect(routes[i], routes[j])) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        Queue<Map.Entry<Integer, Integer>> bfs = new LinkedList<>();
        List<Integer> targets = new ArrayList<>();
        List<Integer> sources = new ArrayList<>();
        for (int i = 0; i < routes.length; i++) {
            if (Arrays.binarySearch(routes[i], source) >= 0) {
                bfs.add(Map.entry(i, 0));
                sources.add(i);
            }
            if (Arrays.binarySearch(routes[i], target) >= 0) {
                targets.add(i);
            }
        }

        while (!bfs.isEmpty()) {
            Map.Entry<Integer, Integer> point = bfs.poll();
            int bus = point.getKey();
            int depth = point.getValue();
            if (targets.contains(bus)) {
                return depth + 1;
            }
            for (Integer connectedBus : graph.get(bus)) {
                if (!sources.contains(connectedBus)) {
                    sources.add(connectedBus);
                    bfs.add(Map.entry(connectedBus, depth + 1));
                }
            }
        }

        return -1;
    }

    private boolean isIntersect(int[] routes1, int[] routes2) {
        int i = 0, j = 0;
        while (i < routes1.length && j < routes2.length) {
            if (routes1[i] == routes2[j]) return true;
            if (routes1[i] < routes2[j]) i++;
            else j++;
        }
        return false;
    }
}
