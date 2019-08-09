package ru.saidgadjiev.leetcode.easy._226;

import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

class SolutionTest {

    @Test
    void invertTree() {
        TreeNode treeNode = new TreeNode(1);

        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);

        TreeNode inverted = new Solution().invertTree(treeNode);

        TreeNode.print(inverted);
    }
}