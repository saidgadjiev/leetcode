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
        int length = length(head);
        k = k % length;

        ListNode lastRotated = head;
        for (int i = 0; i < k; i++) {
            lastRotated = rotate(lastRotated);
        }

        return lastRotated;
    }

    private int length(ListNode head) {
        int length = 1;
        while (head.next != null) {
            head = head.next;
            ++length;
        }

        return length;
    }

    private ListNode rotate(ListNode head) {
        ListNode toSwap = head;

        while (head.next.next != null) {
            head = head.next;
        }
        ListNode toSwapLast = head.next;
        head.next = null;
        toSwapLast.next = toSwap;

        return toSwapLast;
    }
}
