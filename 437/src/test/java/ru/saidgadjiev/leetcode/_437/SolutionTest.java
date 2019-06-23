package ru.saidgadjiev.leetcode._437;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void pathSum() {
        TreeNode treeNode = new TreeNode(1);

        treeNode.setLeft(new TreeNode(-2));
        treeNode.setRight(new TreeNode(-3));

        treeNode.getLeft().setLeft(new TreeNode(1));
        treeNode.getRight().setLeft(new TreeNode(-2));

        treeNode.getLeft().getLeft().setLeft(new TreeNode(-1));
        treeNode.getLeft().setRight(new TreeNode(3));

        int result = new Solution().pathSum(treeNode, -1);

        Assertions.assertEquals(4, result);
    }
}