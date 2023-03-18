package ru.saidgadjiev.leetcode.easy._19;

import ru.saidgadjiev.leetcode.common.ListNode;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int listSize = 0;
        ListNode start = head;
        while (start != null) {
            ++listSize;
            start = start.next;
        }
        int removeFromStart = listSize - n;
        start = head;
        for (int i = 0; i < removeFromStart - 1; i++) {
            start = start.next;
        }
        if (n == listSize) {
            head = head.next;
        } else if (n == 1) {
            start.next = null;
        } else {
            start.next = start.next.next;
        }

        return head;
    }
}
