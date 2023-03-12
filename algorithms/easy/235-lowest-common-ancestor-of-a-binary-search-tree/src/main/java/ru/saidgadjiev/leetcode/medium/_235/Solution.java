package ru.saidgadjiev.leetcode.medium._235;

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
        if (root == null) {
            return null;
        }
        List<TreeNode> pPath = new ArrayList<>();
        TreeNode pResult = lowestCommonAncestor(root, p, pPath);
        if (pResult != null) {
            List<TreeNode> qPath = new ArrayList<>();

            TreeNode qResult = lowestCommonAncestor(root, q, qPath);
            if (qResult != null) {
                int i = 1;
                while (i <= Math.min(pPath.size(), qPath.size())) {
                    if (pPath.get(pPath.size() - i) != qPath.get(qPath.size() - i)) {
                        return pPath.get(pPath.size() - i + 1);
                    }
                    ++i;
                }

                return i > pPath.size() ? pPath.get(0) : qPath.get(0);
            }
        }

        return null;
    }

    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode target, List<TreeNode> path) {
        if (root == null) {
            return null;
        }
        if (target == root) {
            path.add(root);
            return target;
        }
        TreeNode left = lowestCommonAncestor(root.left, target, path);
        if (left != null) {
            path.add(root);
            return left;
        }
        TreeNode right = lowestCommonAncestor(root.right, target, path);
        if (right != null) {
            path.add(root);
            return right;
        }

        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);/*
        root.right = new TreeNode(8);*/
        root.left = new TreeNode(1);
/*
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);*/

        TreeNode treeNode = new Solution().lowestCommonAncestor(root, root.left, root);
        if (treeNode != null) {
            System.out.println(treeNode.val);
        } else {
            System.out.println("Not found");
        }
    }
}
