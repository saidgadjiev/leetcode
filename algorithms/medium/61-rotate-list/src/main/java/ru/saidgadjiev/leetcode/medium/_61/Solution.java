package ru.saidgadjiev.leetcode.medium._61;

import ru.saidgadjiev.leetcode.common.ListNode;

/**
 * https://leetcode.com/problems/rotate-list/
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [4,5,1,2,3]
 *
 * 1->2->3->4->5->null 2
 * 4->5->1->2->3->null
 *
 * 1->2->3
 * 4->5
 *
 * length
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode rPartEnd = head;
        int length = 1;
        while (rPartEnd.next != null) {
            rPartEnd = rPartEnd.next;
            ++length;
        }
        k = k % length;

        ListNode lPartEnd = head;
        for (int i = 0; i < length - k - 1; i++) {
            lPartEnd = lPartEnd.next;
        }
        ListNode rPartStart = lPartEnd.next;

        rPartEnd.next = head;
        lPartEnd.next = null;

        return rPartStart == null ? head : rPartStart;
    }
}
