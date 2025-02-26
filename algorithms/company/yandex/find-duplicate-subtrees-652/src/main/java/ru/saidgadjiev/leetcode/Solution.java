package ru.saidgadjiev.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.saidgadjiev.leetcode.common.TreeNode;

public class Solution {

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        Map<String, Integer> visited = new HashMap<>();

        postorder(root, visited, result);

        return result;
    }

    private String postorder(TreeNode root, Map<String, Integer> visited, List<TreeNode> result) {
        if (root == null) {
            return "";
        }
        String left = postorder(root.left, visited, result);
        String right = postorder(root.right, visited, result);

        String key = root.val + "->" + left + "->" + right;
        if (visited.getOrDefault(key, 0) == 1) {
            result.add(root);
        }
        visited.put(key, visited.getOrDefault(key, 0) + 1);

        return key;
    }
}
