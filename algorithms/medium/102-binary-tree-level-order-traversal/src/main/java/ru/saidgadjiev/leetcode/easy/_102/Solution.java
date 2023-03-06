package ru.saidgadjiev.leetcode.easy._102;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(root, 1, result);

        return result;
    }

    public void levelOrder(TreeNode root, int level, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        if (result.size() < level) {
            result.add(new ArrayList<>());
        }
        result.get(level - 1).add(root.val);

        if (root.left != null) {
            levelOrder(root.left, level + 1, result);
        }
        if (root.right != null) {
            levelOrder(root.right, level + 1, result);
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);

        node.right.left = new TreeNode(5);
        node.right.right = new TreeNode(7);
        node.left.left = new TreeNode(10);
        node.left.right = new TreeNode(11);
        List<List<Integer>> lists = new Solution().levelOrder(node);
        System.out.println(lists);
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
