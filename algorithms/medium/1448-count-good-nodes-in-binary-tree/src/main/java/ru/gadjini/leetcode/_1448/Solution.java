package ru.gadjini.leetcode._1448;

import ru.saidgadjiev.leetcode.common.TreeNode;

public class Solution {

    public int goodNodes(TreeNode root) {
        return goodNodes(root, root.val);
    }

    private int goodNodes(TreeNode root, int pathMaxVal) {
        if (root == null) {
            return 0;
        }
        int goodNodes = 0;
        if (root.val >= pathMaxVal) {
            ++goodNodes;
        }
        int leftGoodNodes = goodNodes(root.left, Math.max(pathMaxVal, root.val));
        int rightGoodNodes = goodNodes(root.right, Math.max(pathMaxVal, root.val));
        goodNodes += leftGoodNodes;
        goodNodes += rightGoodNodes;

        return goodNodes;
    }
}
