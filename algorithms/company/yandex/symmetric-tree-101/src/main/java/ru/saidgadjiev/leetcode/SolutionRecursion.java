package ru.saidgadjiev.leetcode;

import ru.saidgadjiev.leetcode.common.TreeNode;

public class SolutionRecursion {

    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }

    private boolean check(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }

        return (left.val == right.val) && check(left.left, right.right) && check(left.right, right.left);
    }
}
