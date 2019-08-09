package ru.saidgadjiev.leetcode.common;

public class TreeNode {
    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    @Deprecated
    public int getVal() {
        return val;
    }

    @Deprecated
    public TreeNode getLeft() {
        return left;
    }

    @Deprecated
    public TreeNode getRight() {
        return right;
    }

    @Deprecated
    public TreeNode setLeft(TreeNode left) {
        this.left = left;

        return left;
    }

    @Deprecated
    public TreeNode setRight(TreeNode right) {
        this.right = right;

        return right;
    }

    public static TreeNode add(TreeNode node, int val) {
        if (node.val > val) {
            if (node.left == null) {
                node.left = new TreeNode(val);

                return node.left;
            }

            return add(node.left, val);
        } else {
            if (node.right == null) {
                node.right = new TreeNode(val);

                return node;
            }

            return add(node.right, val);
        }
    }

    public static void print(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.println(node.val);

        print(node.left);
        print(node.right);
    }
}