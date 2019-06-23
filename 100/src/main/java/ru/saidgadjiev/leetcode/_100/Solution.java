package ru.saidgadjiev.leetcode._100;

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.Objects;

/*
Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
 */
public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        Integer valP = p == null ? null : p.getVal();
        Integer valQ = q == null ? null : q.getVal();

        if (!Objects.equals(valP, valQ)) {
            return false;
        }

        return isSameTree(p.getLeft(), q.getLeft()) && isSameTree(p.getRight(), q.getRight());
    }
}
