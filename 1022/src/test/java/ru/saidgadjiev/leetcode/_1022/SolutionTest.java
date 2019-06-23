package ru.saidgadjiev.leetcode._1022;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sumRootToLeaf() {
        TreeNode treeNode = new TreeNode(1);

        treeNode.setLeft(new TreeNode(1));

        int sum = new Solution().sumRootToLeaf(treeNode);

        Assertions.assertEquals(sum, 3);
    }
}