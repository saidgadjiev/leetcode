package ru.saidgadjiev.leetcode.medium._124;

import ru.saidgadjiev.leetcode.common.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 */
public class Solution {

    private int maxSum;

    public int maxPathSum(TreeNode root) {
        maxSum = root.val;
        pathSum(root);

        return maxSum;
    }

    private int pathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sumLeft = Math.max(0, pathSum(root.left));
        int sumRight = Math.max(0, pathSum(root.right));

        maxSum = Math.max(maxSum, sumLeft + sumRight + root.val);

        return Math.max(sumLeft + root.val, sumRight + root.val);
    }
}
