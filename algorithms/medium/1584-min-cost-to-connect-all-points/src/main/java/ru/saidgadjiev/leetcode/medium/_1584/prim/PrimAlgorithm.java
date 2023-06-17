package ru.saidgadjiev.leetcode.medium._1584.prim;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;

public class PrimAlgorithm {

    public int minCostConnectPoints(int[][] points) {
        int edgesCount = points.length;
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getKey));
        boolean[] visited = new boolean[edgesCount];

        priorityQueue.offer(Map.entry(0, 0));
        int connectedEdges = 0;
        int mstCost = 0;
        while (connectedEdges < edgesCount) {
            Map.Entry<Integer, Integer> currEdge = priorityQueue.poll();
            int edge = currEdge.getValue();
            int weight = currEdge.getKey();

            if (visited[edge]) {
                continue;
            }
            visited[edge] = true;
            ++connectedEdges;
            mstCost += weight;
            for (int i = 0; i < edgesCount; i++) {
                if (!visited[i]) {
                    int nextWeight = Math.abs(points[edge][0] - points[i][0]) + Math.abs(points[edge][1] - points[i][1]);
                    priorityQueue.offer(Map.entry(nextWeight, i));
                }
            }
        }

        return mstCost;
    }
}
