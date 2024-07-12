package ru.saidgadjiev.leetcode.medium._863;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.saidgadjiev.leetcode.common.TreeNode;

public class Solution {

    private final Map<Integer, List<Integer>> graph = new HashMap<>();
    private final List<Integer> result = new ArrayList<>();
    private final Set<Integer> visited = new HashSet<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        buildGraph(root, null);
        findDistance(target.val, k);

        return result;
    }

    private void findDistance(int root, int k) {
        if (k == 0) {
            result.add(root);
        }

        visited.add(root);
        for (Integer integer : graph.get(root)) {
            if (!visited.contains(integer)) {
                findDistance(integer, k - 1);
            }
        }
    }

    private void buildGraph(TreeNode root, TreeNode prev) {
        if (root == null) {
            return;
        }
        graph.putIfAbsent(root.val, new ArrayList<>());
        if (prev != null) {
            graph.get(prev.val).add(root.val);
            graph.get(root.val).add(prev.val);
        }

        buildGraph(root.left, root);
        buildGraph(root.right, root);
    }
}
