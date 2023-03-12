package ru.saidgadjiev.leetcode.medium._235;

import ru.saidgadjiev.leetcode.common.TreeNode;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 *           6
 *      2          8
 *   0      4    7    9
 *       3     5
 *
 *       2    8
 *
 * u 2 6
 * 4 2 6
 * 3 4 2 6
 * 5 4 2 6
 */
public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        TreeNode treeNode = new Solution().lowestCommonAncestor(root, root.left.left, root.left.right);
        if (treeNode != null) {
            System.out.println(treeNode.val);
        } else {
            System.out.println("Not found");
        }
    }
}
