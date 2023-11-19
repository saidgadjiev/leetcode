package ru.saidgadjiev.leetcode.medium._1372;

import ru.saidgadjiev.leetcode.common.TreeNode;

/**
 * https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/
 * Считаем зиг заг путь от каждой вершины + запускаем новый путь от вершины которая не входит в зигзаг
 */
public class Solution {

    public int longestZigZag;

    public void longestZigZag(TreeNode root, boolean goLeft, int path) {
        if (root == null) {
            return;
        }
        longestZigZag = Math.max(longestZigZag, path);
        if (goLeft) {
            longestZigZag(root.left, false, path + 1);
            longestZigZag(root.right, true, 1);
        } else {
            longestZigZag(root.left, false, 1);
            longestZigZag(root.right, true, path + 1);
        }
    }

    public int longestZigZag(TreeNode root) {
        longestZigZag(root, false, 0);
        longestZigZag(root, true, 0);

        return longestZigZag;
    }
}
