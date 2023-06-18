package ru.saidgadjiev.leetcode.medium._261.unionfind;

public class UnionFindAlgorithm {

    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) return false;

        UnionFind unionFind = new UnionFind(n);
        for (int[] edge : edges) {
            if (!unionFind.union(edge[0], edge[1])) {
                return false;
            }
        }

        return true;
    }

    private static class UnionFind {

        private final int[] root;

        public UnionFind(int n) {
            root = new int[n];
            for (int i = 0; i < n; i++) {
                root[i] = i;
            }
        }

        public int find(int node) {
            while (root[node] != node) {
                node = root[node];
            }

            return node;
        }

        public boolean union(int node1, int node2) {
            int root1 = find(node1);
            int root2 = find(node2);

            if (root1 == root2) {
                return false;
            }

            root[root1] = root2;

            return true;
        }
    }
}
