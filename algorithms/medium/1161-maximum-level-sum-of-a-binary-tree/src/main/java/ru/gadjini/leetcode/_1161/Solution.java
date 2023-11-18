package ru.gadjini.leetcode._1161;

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int maxLevelSum(TreeNode root) {
        int maxLevelSum = Integer.MIN_VALUE, maxLevel = 0, currentLevel = 0;

        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.add(root);

        while (!bfs.isEmpty()) {
            currentLevel++;
            int sumByLevel = 0;
            for (int i = bfs.size(); i > 0; --i) {
                TreeNode current = bfs.poll();
                sumByLevel += current.val;

                if (current.left != null) {
                    bfs.offer(current.left);
                }
                if (current.right != null) {
                    bfs.offer(current.right);
                }
            }
            if (maxLevelSum < sumByLevel) {
                maxLevel = currentLevel;
                maxLevelSum = sumByLevel;
            }
        }

        return maxLevel;
    }
}
