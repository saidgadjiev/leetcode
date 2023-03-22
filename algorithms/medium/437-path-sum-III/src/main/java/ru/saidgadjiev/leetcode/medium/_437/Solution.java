package ru.saidgadjiev.leetcode.medium._437;

import ru.saidgadjiev.leetcode.common.TreeNode;

/**
 * https://leetcode.com/problems/path-sum-iii
 */
public class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        return pathSum(root, targetSum, 0)
                + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    private int pathSum(TreeNode root, int targetSum, int currentSum) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        currentSum += root.val;
        if (currentSum == targetSum) {
            ++result;
        }

        int resultLeft = pathSum(root.left, targetSum, currentSum);
        int resultRight = pathSum(root.right, targetSum, currentSum);

        return resultLeft + resultRight + result;
    }
}
