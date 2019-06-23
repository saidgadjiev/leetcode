package ru.saidgadjiev.leetcode._112;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hasPathSum() {
        TreeNode treeNode = new TreeNode(1);

        treeNode.setLeft(new TreeNode(2));

        boolean result = new Solution().hasPathSum(treeNode, 3);

        Assertions.assertTrue(result);
    }
}