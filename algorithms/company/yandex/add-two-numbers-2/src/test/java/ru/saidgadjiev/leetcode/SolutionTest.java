package ru.saidgadjiev.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.ListNode;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(
            new ListNode(2, new ListNode(4, new ListNode(3))),
            new ListNode(5, new ListNode(6, new ListNode(4)))
        );

        Assertions.assertEquals(7, listNode.val);
        Assertions.assertEquals(0, listNode.next.val);
        Assertions.assertEquals(8, listNode.next.next.val);
    }
}
