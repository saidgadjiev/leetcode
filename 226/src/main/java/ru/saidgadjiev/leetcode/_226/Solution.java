package ru.saidgadjiev.leetcode._226;

import ru.saidgadjiev.leetcode.common.TreeNode;


/**
 * Invert a binary tree.
 *
 * Example:
 *
 * Input:
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * Output:
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 */
public class Solution {

    public TreeNode invertTree(TreeNode root) {
        TreeNode result = new TreeNode(root.getVal());

        invertTree(root, result);

        return result;
    }

    private void invertTree(TreeNode node, TreeNode result) {
        if (node == null) {
            return;
        }

        result.setLeft(node.getRight());
        result.setRight(node.getLeft());

        invertTree(node.getRight(), result.getLeft());
        invertTree(node.getLeft(), result.getRight());
    }
}
