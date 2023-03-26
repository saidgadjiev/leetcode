package ru.saidgadjiev.leetcode.medium._108;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        TreeNode actual = solution.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});

        Assertions.assertTrue(actual.equals(new TreeNode(0, new TreeNode(-10, null, new TreeNode(-3)), new TreeNode(5, null, new TreeNode(9)))));
    }
}