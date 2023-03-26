package ru.saidgadjiev.leetcode.common;

public class TreeNode {
    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
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

    public boolean equals(TreeNode other) {
        if (other == null) {
            return false;
        }

        // Different Values
        if (this.val != other.val) {
            return false;
        }

        if (this.left == null && other.left != null) {
            return false;
        }
        if (this.left != null && !this.left.equals(other.left)) {
            return false;
        }

        if (this.right == null && other.right != null) {
            return false;
        }
        return this.right == null || this.right.equals(other.right);
    }
}