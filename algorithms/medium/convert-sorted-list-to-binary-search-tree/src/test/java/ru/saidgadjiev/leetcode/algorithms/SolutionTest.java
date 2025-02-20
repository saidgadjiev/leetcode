package ru.saidgadjiev.leetcode.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.ListNode;
import ru.saidgadjiev.leetcode.common.TreeNode;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        TreeNode node = solution.sortedListToBST(
            new ListNode(-20, new ListNode(-10, new ListNode(-3, new ListNode(0, new ListNode(5, new ListNode(9))))))
        );

        Assertions.assertEquals(0, node.val);
        Assertions.assertEquals(-3, node.left.val);
        Assertions.assertEquals(-10, node.left.left.val);
        Assertions.assertEquals(9, node.right.val);
        Assertions.assertEquals(5, node.right.left.val);
    }
}
