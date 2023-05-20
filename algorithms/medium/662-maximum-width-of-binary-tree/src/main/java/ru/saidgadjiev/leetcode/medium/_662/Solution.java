package ru.saidgadjiev.leetcode.medium._662;

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Map;

public class Solution {

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        // queue of elements [(node, col_index)]
        LinkedList<Map.Entry<TreeNode, Integer>> queue = new LinkedList<>();
        int maxWidth = 0;

        queue.addLast(Map.entry(root, 0));
        while (queue.size() > 0) {
            Map.Entry<TreeNode, Integer> head = queue.getFirst();

            // iterate through the current level
            int currLevelSize = queue.size();
            Map.Entry<TreeNode, Integer> elem = null;
            for (int i = 0; i < currLevelSize; ++i) {
                elem = queue.removeFirst();
                TreeNode node = elem.getKey();
                if (node.left != null)
                    queue.addLast(Map.entry(node.left, 2 * elem.getValue()));
                if (node.right != null)
                    queue.addLast(Map.entry(node.right, 2 * elem.getValue() + 1));
            }

            // calculate the length of the current level,
            //   by comparing the first and last col_index.
            maxWidth = Math.max(maxWidth, elem.getValue() - head.getValue() + 1);
        }

        return maxWidth;
    }
}
