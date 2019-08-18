package ru.saidgadjiev.leetcode._101;


import ru.saidgadjiev.leetcode.common.TreeNode;

public class Solution {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    public boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        return p.getVal() == q.getVal() && isSymmetric(p.getRight(), q.getLeft()) && isSymmetric(p.getLeft(), q.getRight());
    }
}
