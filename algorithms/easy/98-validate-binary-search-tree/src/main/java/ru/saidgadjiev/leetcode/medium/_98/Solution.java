package ru.saidgadjiev.leetcode.medium._98;

import ru.saidgadjiev.leetcode.common.TreeNode;

/**
 * https://leetcode.com/problems/validate-binary-search-tree/
 *    3
 *  2   6
 *    7      10
 *       9        13
 *     7   10  11          12
 *  4    8   4     12   3     15
 *  Если мы идем сверху вниз получается надо проверить что справа больший чем то что мы имеем, а слева меньший
 *
 * [120,70,140,50,100,130,160,20,55,75,110,119,135,150,200]
 *                        120
 *                      70 |           140
 *              50    100 |       130       160
 *          20 55 | 75 110 |  119   135 | 150 200
 *
 *          3,1,5,0,2,4,6
 *
 *          3
 *       1       5
 *    0    2  4    6
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    public boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.val <= root.left.val) {
            return false;
        }
        if (root.right != null && root.val >= root.right.val) {
            return false;
        }
        if (min != null && root.left != null && root.left.val <= min) {
            return false;
        }
        if (min != null && root.right != null && root.right.val <= min) {
            return false;
        }
        if (max != null && root.right != null && root.right.val >= max) {
            return false;
        }
        if (max != null && root.left != null && root.left.val >= max) {
            return false;
        }

        return isValidBST(root.left, min, root.val)
                && isValidBST(root.right, root.val, max);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(120);

        treeNode.setLeft(new TreeNode(70));
        TreeNode right = treeNode.setRight(new TreeNode(140));
        treeNode.setRight(right);

        right.setLeft(new TreeNode(130));
        right.setRight(new TreeNode(160));

        treeNode.left.setLeft(new TreeNode(50));
        treeNode.left.setRight(new TreeNode(100));
        right.left.setLeft(new TreeNode(121));
        right.left.setRight(new TreeNode(135));

        right.right.left = new TreeNode(150);
        right.right.right = new TreeNode(200);

        boolean validBST = new Solution().isValidBST(treeNode);
        System.out.println(validBST);
    }
}
