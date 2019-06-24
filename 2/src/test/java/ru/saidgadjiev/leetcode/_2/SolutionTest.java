package ru.saidgadjiev.leetcode._2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addTwoNumbers() {
        ListNode listNode1 = new ListNode(2);

        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);
        ListNode listNode2 = new ListNode(5);

        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);

        ListNode result = new Solution().addTwoNumbers(listNode1, listNode2);

        Assertions.assertEquals(result.val, 7);
        Assertions.assertEquals(result.next.val, 0);
        Assertions.assertEquals(result.next.next.val, 8);
    }
}