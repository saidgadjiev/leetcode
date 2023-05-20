package ru.saidgadjiev.leetcode.medium._124;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.maxPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3)));
        Assertions.assertEquals(6, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.maxPathSum(new TreeNode(-10, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
        Assertions.assertEquals(42, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.maxPathSum(new TreeNode(-3));
        Assertions.assertEquals(-3, i);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        int i = solution.maxPathSum(new TreeNode(1, new TreeNode(-2), new TreeNode(3)));
        Assertions.assertEquals(4, i);
    }
}