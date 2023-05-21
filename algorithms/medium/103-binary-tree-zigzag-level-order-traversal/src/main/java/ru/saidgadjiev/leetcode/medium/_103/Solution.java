package ru.saidgadjiev.leetcode.medium._103;

import com.sun.source.tree.Tree;
import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.*;

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
            if (rightToLeft) {
                ArrayDeque<TreeNode> nextLevelQueue = new ArrayDeque<>();
                List<Integer> zigZag = new ArrayList<>();

                while (!nodesQueue.isEmpty()) {
                    TreeNode first = nodesQueue.pollLast();

                    if (first.right != null) {
                        nextLevelQueue.add(first.right);
                    }
                    if (first.left != null) {
                        nextLevelQueue.add(first.left);
                    }
                    zigZag.add(first.val);
                }

                nodesQueue = nextLevelQueue;
                rightToLeft = false;
                result.add(zigZag);
            } else {
                ArrayDeque<TreeNode> nextLevelQueue = new ArrayDeque<>();
                List<Integer> zigZag = new ArrayList<>();

                while (!nodesQueue.isEmpty()) {
                    TreeNode first = nodesQueue.pollLast();

                    if (first.left != null) {
                        nextLevelQueue.add(first.left);
                    }
                    if (first.right != null) {
                        nextLevelQueue.add(first.right);
                    }
                    zigZag.add(first.val);
                }

                nodesQueue = nextLevelQueue;
                rightToLeft = true;
                result.add(zigZag);
            }
        }

        return result;
    }
}
