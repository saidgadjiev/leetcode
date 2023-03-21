package ru.saidgadjiev.leetcode.medium._110;


import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * https://leetcode.com/problems/balanced-binary-tree
 * <p>
 * depth of each subtries is not differ more then one
 * <p>
 * <p>
 * 1
 * 2        2
 * 3              3
 * 4                     4
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        AtomicBoolean result = new AtomicBoolean(true);

        isBalanced(root, 1, result);

        return result.get();
    }

    private int isBalanced(TreeNode root, int level, AtomicBoolean result) {
        if (root == null) {
            return level;
        }
        int depthLeft = isBalanced(root.left, level, result);
        int depthRight = isBalanced(root.right, level, result);

        if (Math.abs(depthRight - depthLeft) > 1 && result.get()) {
            result.set(false);
        }

        return Math.max(depthRight, depthLeft) + 1;
    }
}
