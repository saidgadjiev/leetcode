package ru.saidgadjiev.leetcode.medium._543;

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 */
public class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        AtomicInteger result = new AtomicInteger();
        diameterOfBinaryTree(root, 0, result);
        return result.get();
    }

    private int diameterOfBinaryTree(TreeNode root, int level, AtomicInteger result) {
        if (root == null) {
            return level;
        }
        int depthLeft = diameterOfBinaryTree(root.left, level, result);
        int depthRight = diameterOfBinaryTree(root.right, level, result);
        result.set(Math.max(result.get(), depthLeft + depthRight));

        return Math.max(depthRight, depthLeft) + 1;
    }
}
