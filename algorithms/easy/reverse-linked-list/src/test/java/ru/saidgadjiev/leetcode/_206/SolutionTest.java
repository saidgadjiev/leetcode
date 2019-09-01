package ru.saidgadjiev.leetcode._206;

import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseList() {
        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        new Solution().reverseList(head);
    }
}