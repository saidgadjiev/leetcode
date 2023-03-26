package ru.saidgadjiev.leetcode.medium._230;

import com.sun.source.tree.Tree;
import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst
 */
public class Solution {
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        AtomicInteger atomicInteger = new AtomicInteger();
        search(root, k, atomicInteger);

        return atomicInteger.get();
    }

    private void search(TreeNode root, int k, AtomicInteger result) {
        if (root == null) {
            return;
        }
        search(root.left, k, result);
        count++;

        if (k == count) {
            result.set(root.val);
        }
        search(root.right, k, result);
    }
}
