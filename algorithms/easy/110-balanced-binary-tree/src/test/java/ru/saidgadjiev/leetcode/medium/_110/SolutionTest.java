package ru.saidgadjiev.leetcode.medium._110;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        boolean balanced = solution.isBalanced(new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))));
        Assertions.assertTrue(balanced);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        boolean balanced = solution.isBalanced(new TreeNode(1,
                new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2)));
        Assertions.assertFalse(balanced);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        boolean balanced = solution.isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null));

        Assertions.assertFalse(balanced);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        boolean balanced = solution.isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3), null), new TreeNode(3)));

        Assertions.assertTrue(balanced);
    }

    @Test
    void case5() {
        Solution solution = new Solution();
        boolean balanced = solution.isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3), null), new TreeNode(3, new TreeNode(2), null)));

        Assertions.assertTrue(balanced);
    }

    @Test
    void case6() {
        Solution solution = new Solution();
        boolean balanced = solution.isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3), null), new TreeNode(3, new TreeNode(2), new TreeNode(4, new TreeNode(5, new TreeNode(6), null), null))));

        Assertions.assertFalse(balanced);
    }

    @Test
    void case7() {
        Solution solution = new Solution();
        boolean balanced = solution.isBalanced(new TreeNode(1,
                new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null), new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4)))));
        Assertions.assertFalse(balanced);
    }
}