package ru.saidgadjiev.leetcode.medium._173;

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.Stack;

public class BSTIterator {

    private final Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        stack.push(root);

        TreeNode left = root.left;
        while (left != null) {
            stack.push(left);
            left = left.left;
        }
    }

    public int next() {
        TreeNode toReturn = stack.pop();

        if (toReturn.right != null) {
            TreeNode right = toReturn.right;
            stack.push(right);
            TreeNode left = right.left;

            while (left != null) {
                stack.push(left);
                left = left.left;
            }
        }

        return toReturn.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
