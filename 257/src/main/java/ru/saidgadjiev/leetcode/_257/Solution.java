package ru.saidgadjiev.leetcode._257;

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a binary tree, return all root-to-leaf paths.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Input:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * Output: ["1->2->5", "1->3"]
 *
 * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */
public class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Set<String> paths = new LinkedHashSet<>();

        binaryTreePaths(root.left, paths, String.valueOf(root.val));
        binaryTreePaths(root.right, paths, String.valueOf(root.val));

        if (paths.isEmpty()) {
            paths.add(String.valueOf(root.val));
        }

        return new ArrayList<>(paths);
    }

    private void binaryTreePaths(TreeNode node, Set<String> paths, String path) {
        if (node == null) {
            return;
        }
        if (node.right == null && node.left == null) {
            paths.add(path + "->" + node.val);
        }

        binaryTreePaths(node.left, paths, path + "->" + node.val);
        binaryTreePaths(node.right, paths, path + "->" + node.val);
    }
}
