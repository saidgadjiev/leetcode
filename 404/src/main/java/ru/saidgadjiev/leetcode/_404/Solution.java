package ru.saidgadjiev.leetcode._404;

import ru.saidgadjiev.leetcode.common.TreeNode;

/**
 * Find the sum of all left leaves in a given binary tree.
 *
 * Example:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }

    private int sumOfLeftLeaves(TreeNode root, boolean left) {
        if (root == null) {
            return 0;
        }
        if (root.getLeft() == null && root.getRight() == null && left) {
            return root.getVal();
        }

        return sumOfLeftLeaves(root.getLeft(), true) + sumOfLeftLeaves(root.getRight(), false);
    }
}
