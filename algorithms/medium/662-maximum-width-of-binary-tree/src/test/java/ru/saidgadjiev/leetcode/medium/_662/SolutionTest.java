package ru.saidgadjiev.leetcode.medium._662;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.widthOfBinaryTree(new TreeNode(1, new TreeNode(3, new TreeNode(5, new TreeNode(6), null),
                null), new TreeNode(2, null, new TreeNode(9, new TreeNode(7), null))));
        Assertions.assertEquals(7, i);
    }
}