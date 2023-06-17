package ru.saidgadjiev.leetcode.medium._1584.kruskal;

/**
 * https://leetcode.com/problems/min-cost-to-connect-all-points/
 * Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
 * Output: 20
 */
class UnionFind {

    private int[] root;

    public UnionFind(int edgesCount) {
        root = new int[edgesCount];
        for (int i = 0; i < edgesCount; i++) {
            root[i] = i;
        }
    }

    public int find(int edge) {
        while (edge != root[edge]) {
            edge = root[edge];
        }

        return edge;
    }

    public boolean union(int edge1, int edge2) {
        int edge1Root = find(edge1);
        int edge2Root = find(edge2);

        if (edge1Root != edge2Root) {
            root[edge2Root] = edge1Root;

            return true;
        }

        return false;
    }
}
