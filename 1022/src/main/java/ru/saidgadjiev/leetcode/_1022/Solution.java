package ru.saidgadjiev.leetcode._1022;

import ru.saidgadjiev.leetcode.common.TreeNode;

/**
 * Given a binary tree, each node has value 0 or 1.  Each root-to-leaf path represents a binary number starting with the most significant bit.  For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
 *
 * For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
 *
 * Return the sum of these numbers.
 *
 *
 *
 * Example 1:
 * Input: [1,0,1,0,1,0,1]
 * Output: 22
 * Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
 *
 *
 * Note:
 *
 * The number of nodes in the tree is between 1 and 1000.
 * node.val is 0 or 1.
 * The answer will not exceed 2^31 - 1.
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeaf(root, "");
    }

    public int sumRootToLeaf(TreeNode node, String nextChain) {
        if (node == null) {
            return 0;
        }
        nextChain += node.getVal();

        if (node.getLeft() == null && node.getRight() == null) {
            return Integer.parseInt(nextChain, 2);
        }

        return sumRootToLeaf(node.getLeft(), nextChain) + sumRootToLeaf(node.getRight(), nextChain);
    }
}
