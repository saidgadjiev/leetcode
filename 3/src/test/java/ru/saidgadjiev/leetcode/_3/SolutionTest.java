package ru.saidgadjiev.leetcode._3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;


class SolutionTest {

    @Test
    void findTarget() {
        TreeNode rootNode = new TreeNode(5);

        TreeNode.add(rootNode, 3);
        TreeNode.add(rootNode, 6);
        TreeNode.add(rootNode, 2);
        TreeNode.add(rootNode, 4);
        TreeNode.add(rootNode, 7);

        boolean result = new Solution().findTarget(rootNode, 9);

        Assertions.assertTrue(result);
    }
}