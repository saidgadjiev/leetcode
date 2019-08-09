package ru.saidgadjiev.leetcode._100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

class SolutionTest {

    @Test
    void isSameTree() {
        TreeNode rootNode1 = new TreeNode(1);

        TreeNode.add(rootNode1, 2);
        TreeNode.add(rootNode1, 3);

        TreeNode rootNode2 = new TreeNode(1);

        TreeNode.add(rootNode2, 2);
        TreeNode.add(rootNode2, 3);

        boolean result = new Solution().isSameTree(rootNode1, rootNode2);

        Assertions.assertTrue(result);
    }
}