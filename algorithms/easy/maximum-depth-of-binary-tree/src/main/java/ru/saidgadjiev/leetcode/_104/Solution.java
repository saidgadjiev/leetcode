package ru.saidgadjiev.leetcode._104;

import ru.saidgadjiev.leetcode.common.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);

        int biggest = Math.max(depthLeft, depthRight);

        return biggest + 1;
    }
}
