package ru.gadjini.leetcode._700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode actual = solution.searchBST(root, 2);

        TreeNode expected = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        Assertions.assertTrue(actual.equals(expected));
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode actual = solution.searchBST(root, 5);

        assertNull(actual);
    }
}