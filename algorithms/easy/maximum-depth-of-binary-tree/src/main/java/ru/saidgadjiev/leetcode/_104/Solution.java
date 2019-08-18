package ru.saidgadjiev.leetcode._104;

import ru.saidgadjiev.leetcode.common.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depthLeft = maxDepth(root.getLeft());
        int depthRight = maxDepth(root.getRight());

        int bigger = Math.max(depthLeft, depthRight);

        return bigger + 1;
    }
}
