package ru.gadjini.leetcode._872;

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> firstTreeLeaf = new ArrayList<>();
        readLeaf(root1, firstTreeLeaf);

        List<Integer> secondTreeLeaf = new ArrayList<>();
        readLeaf(root2, secondTreeLeaf);

        if (firstTreeLeaf.size() != secondTreeLeaf.size()) {
            return false;
        }
        for (int i = 0; i < firstTreeLeaf.size(); i++) {
            if (!Objects.equals(firstTreeLeaf.get(i), secondTreeLeaf.get(i))) {
                return false;
            }
        }

        return true;
    }

    private void readLeaf(TreeNode root, List<Integer> leaf) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leaf.add(root.val);
        }

        readLeaf(root.left, leaf);
        readLeaf(root.right, leaf);
    }
}
