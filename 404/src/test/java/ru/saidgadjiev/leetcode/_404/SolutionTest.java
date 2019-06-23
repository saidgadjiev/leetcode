package ru.saidgadjiev.leetcode._404;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sumOfLeftLeaves() {
        TreeNode treeNode = new TreeNode(3);

        treeNode.setLeft(new TreeNode(9));

        int sum = new Solution().sumOfLeftLeaves(treeNode);

        Assertions.assertEquals(sum, 9);
    }
}