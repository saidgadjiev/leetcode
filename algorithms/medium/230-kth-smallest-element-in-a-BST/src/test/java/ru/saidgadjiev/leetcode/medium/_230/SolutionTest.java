package ru.saidgadjiev.leetcode.medium._230;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.kthSmallest(new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4)), 1);
        Assertions.assertEquals(1, i);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        int i = solution.kthSmallest(new TreeNode(5, new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)), new TreeNode(6)), 3);
        Assertions.assertEquals(3, i);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        int i = solution.kthSmallest(new TreeNode(1, null, new TreeNode(2)), 2);
        Assertions.assertEquals(2, i);
    }
}