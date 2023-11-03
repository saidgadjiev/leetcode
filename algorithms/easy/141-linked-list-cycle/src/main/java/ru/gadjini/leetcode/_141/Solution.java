package ru.gadjini.leetcode._141;

import ru.saidgadjiev.leetcode.common.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle
 * https://gabhisekdev.medium.com/why-does-floyds-cycle-detection-algorithm-work-59f61984dc3e
 *
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
