package ru.saidgadjiev.leetcode.medium._24;

import ru.saidgadjiev.leetcode.common.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = head.next;
        ListNode prevSwapped = null;

        while (head != null && head.next != null) {
            ListNode toSwap = head.next;
            head.next = head.next.next;
            toSwap.next = head;
            if (prevSwapped != null) {
                prevSwapped.next = toSwap;
            }
            prevSwapped = head;
            head = head.next;
        }

        return result;
    }
}
