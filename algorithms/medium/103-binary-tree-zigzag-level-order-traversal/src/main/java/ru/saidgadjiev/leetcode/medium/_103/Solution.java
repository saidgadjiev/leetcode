package ru.saidgadjiev.leetcode.medium._103;

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        List<List<Integer>> result = new ArrayList<>();
        ArrayDeque<TreeNode> nodesQueue = new ArrayDeque<>();
        nodesQueue.addLast(root);
        boolean rightToLeft = false;

        while (!nodesQueue.isEmpty()) {
            ArrayDeque<TreeNode> nextLevelQueue = new ArrayDeque<>();
            List<Integer> zigZag = new ArrayList<>();

            while (!nodesQueue.isEmpty()) {
                TreeNode last = nodesQueue.pollLast();

                if (rightToLeft) {
                    pushRightToLeftOrder(nextLevelQueue, last);
                } else {
                    pushLeftToRightOrder(nextLevelQueue, last);
                }
                zigZag.add(last.val);
            }

            nodesQueue = nextLevelQueue;
            rightToLeft = !rightToLeft;
            result.add(zigZag);
        }

        return result;
    }

    private void pushRightToLeftOrder(Deque<TreeNode> deque, TreeNode root) {
        if (root.right != null) {
            deque.add(root.right);
        }
        if (root.left != null) {
            deque.add(root.left);
        }
    }

    private void pushLeftToRightOrder(Deque<TreeNode> deque, TreeNode root) {
        if (root.left != null) {
            deque.add(root.left);
        }
        if (root.right != null) {
            deque.add(root.right);
        }
    }
}
