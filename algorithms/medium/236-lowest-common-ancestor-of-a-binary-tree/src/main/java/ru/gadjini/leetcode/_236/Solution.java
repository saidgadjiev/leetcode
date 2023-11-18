package ru.gadjini.leetcode._236;

import ru.saidgadjiev.leetcode.common.TreeNode;

public class Solution {

    private TreeNode ans;

    public Solution() {
        this.ans = null;
    }

    private boolean recurseTree(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }

        int left = this.recurseTree(root.left, p, q) ? 1 : 0;

        int right = this.recurseTree(root.right, p, q) ? 1 : 0;

        int mid = (root == p || root == q) ? 1 : 0;

        if (mid + left + right >= 2) {
            ans = root;
        }

        return (mid + left + right > 0);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        recurseTree(root, p, q);

        return ans;
    }
}
