package ru.gadjini.leetcode._637;

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avg = new ArrayList<>();

        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.offer(root);

        while (!bfs.isEmpty()) {
            double sumByLevel = 0;
            int numNodesByLevel = 0;
            for (int i = bfs.size(); i > 0; i--) {
                TreeNode poll = bfs.poll();
                sumByLevel += poll.val;
                numNodesByLevel++;
                if (poll.left != null) {
                    bfs.offer(poll.left);
                }
                if (poll.right != null) {
                    bfs.offer(poll.right);
                }
            }
            avg.add(sumByLevel / numNodesByLevel);
        }

        return avg;
    }
}
