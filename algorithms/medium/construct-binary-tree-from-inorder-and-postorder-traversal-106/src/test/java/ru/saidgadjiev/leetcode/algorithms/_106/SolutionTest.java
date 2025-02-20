package ru.saidgadjiev.leetcode.algorithms._106;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

class SolutionTest {

    @Test
    void buildTree() {
        Solution solution = new Solution();
        TreeNode treeNode = solution.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});

        Assertions.assertEquals(3, treeNode.val);
        Assertions.assertEquals(9, treeNode.left.val);
        Assertions.assertEquals(20, treeNode.right.val);

        Assertions.assertEquals(15, treeNode.right.left.val);
        Assertions.assertEquals(7, treeNode.right.right.val);
    }
}
