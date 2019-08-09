package ru.saidgadjiev.leetcode._104;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

class SolutionTest {

    @Test
    void maxDepth() {
        TreeNode treeNode = new TreeNode(5);

        TreeNode.add(treeNode, 4);
        TreeNode.add(treeNode, 6);
        TreeNode.add(treeNode, 2);

        int maxDepth = new Solution().maxDepth(treeNode);

        Assertions.assertEquals(2, maxDepth);
    }
}