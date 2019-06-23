package ru.saidgadjiev.leetcode._3;

/*
Example 1:

Input:
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9

Output: True

Example 2:

Input:
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28

Output: False
 */

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean findTarget(TreeNode root, int k) {
        return findTarget(root, k, new HashSet<>());
    }

    private boolean findTarget(TreeNode root, int k, Set<Integer> complementMap) {
        if (root == null) {
            return false;
        }
        if (complementMap.contains(root.getVal())) {
            return true;
        }

        complementMap.add(k - root.getVal());

        return findTarget(root.getLeft(), k, complementMap) || findTarget(root.getRight(), k, complementMap);
    }

}
