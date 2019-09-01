package ru.saidgadjiev.leetcode._206;

import ru.saidgadjiev.leetcode.common.ListNode;

public class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;

        while (head.next != null) {
            ListNode next = head.next;

            head.next = prev;
            prev = head;
            head = next;
        }

        head.next = prev;

        return head;
    }
}
