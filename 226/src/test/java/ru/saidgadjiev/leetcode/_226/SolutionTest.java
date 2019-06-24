package ru.saidgadjiev.leetcode._226;

import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

class SolutionTest {

    @Test
    void invertTree() {
        TreeNode treeNode = new TreeNode(1);

        treeNode.setLeft(new TreeNode(2));
        treeNode.setRight(new TreeNode(3));

        TreeNode inverted = new Solution().invertTree(treeNode);


        TreeNode.print(inverted);
    }
}