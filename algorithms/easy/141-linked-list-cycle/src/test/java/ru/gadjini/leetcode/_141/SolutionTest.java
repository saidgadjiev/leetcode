package ru.gadjini.leetcode._141;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.ListNode;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        ListNode cycleNode = new ListNode(2);

        boolean b = solution.hasCycle(new ListNode(3, cycleNode.next = new ListNode(0, new ListNode(-4, cycleNode))));
        Assertions.assertTrue(b);
    }
}