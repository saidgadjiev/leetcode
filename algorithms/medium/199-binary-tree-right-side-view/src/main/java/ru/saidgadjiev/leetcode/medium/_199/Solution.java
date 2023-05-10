package ru.saidgadjiev.leetcode.medium._199;

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer, Integer> rightSideViewByLevel = new LinkedHashMap<>();

        rightSideView(root, rightSideViewByLevel, 0);

        return new ArrayList<>(rightSideViewByLevel.values());
    }

    public void rightSideView(TreeNode root,  Map<Integer, Integer> rightSideViewByLevel, int level) {
        if (root == null) {
            return;
        }

        rightSideViewByLevel.putIfAbsent(level, root.val);

        rightSideView(root.right, rightSideViewByLevel, level + 1);
        rightSideView(root.left, rightSideViewByLevel, level + 1);
    }
}
