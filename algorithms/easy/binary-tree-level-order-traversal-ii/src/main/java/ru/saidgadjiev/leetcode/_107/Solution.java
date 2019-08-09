package ru.saidgadjiev.leetcode._107;

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.*;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Comparator<Integer> comparator = Integer::compareTo;
        TreeMap<Integer, List<Integer>> levelValues = new TreeMap<>(comparator.reversed());

        levelOrderBottom(root, 0, levelValues);

        return new ArrayList<>(levelValues.values());
    }

    private void levelOrderBottom(TreeNode root, int level, Map<Integer, List<Integer>> levelValues) {
        if (root == null) {
            return;
        }
        levelOrderBottom(root.getLeft(), level + 1, levelValues);
        levelOrderBottom(root.getRight(), level + 1, levelValues);

        levelValues.putIfAbsent(level, new ArrayList<>());
        levelValues.get(level).add(root.getVal());
    }
}
