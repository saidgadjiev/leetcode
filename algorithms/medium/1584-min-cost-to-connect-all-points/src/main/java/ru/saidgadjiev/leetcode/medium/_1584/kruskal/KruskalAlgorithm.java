package ru.saidgadjiev.leetcode.medium._1584.kruskal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KruskalAlgorithm {

    public int minCostConnectPoints(int[][] points) {
        List<int[]> weightedEdges = new ArrayList<>();
        int edgesCount = points.length;

        for (int currEdge = 0; currEdge < edgesCount; currEdge++) {
            for (int adjacentEdge = currEdge + 1; adjacentEdge < edgesCount; adjacentEdge++) {
                int weight = Math.abs(points[currEdge][0] - points[adjacentEdge][0]) + Math.abs(points[currEdge][1] - points[adjacentEdge][1]);

                int[] weightedEdge = new int[] {weight, currEdge, adjacentEdge};
                weightedEdges.add(weightedEdge);
            }
        }
        weightedEdges.sort(Comparator.comparing(a -> a[0]));

        UnionFind unionFind = new UnionFind(edgesCount);
        int connectedEdges = 0;
        int mstCost = 0;
        for (int i = 0; i < weightedEdges.size() && connectedEdges < edgesCount - 1; i++) {
            int node1 = weightedEdges.get(i)[1];
            int node2 = weightedEdges.get(i)[2];

            if (unionFind.union(node1, node2)) {
                mstCost += weightedEdges.get(i)[0];
                ++connectedEdges;
            }
        }

        return mstCost;
    }
}
