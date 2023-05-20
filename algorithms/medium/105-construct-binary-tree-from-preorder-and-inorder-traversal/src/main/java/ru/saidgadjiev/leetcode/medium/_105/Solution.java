package ru.saidgadjiev.leetcode.medium._105;

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Solution {
    private int preorderIndex;
    private final Map<Integer, Integer> inorderIndexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return buildTree(preorder, 0, preorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);

        root.left = buildTree(preorder, left, inorderIndexMap.get(rootValue) - 1);
        root.right = buildTree(preorder, inorderIndexMap.get(rootValue) + 1, right);

        return root;
    }
}
