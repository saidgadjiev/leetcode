package ru.saidgadjiev.leetcode.medium._25;

import ru.saidgadjiev.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/reverse-nodes-in-k-group
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [2,1,4,3,5]
 * <p>
 * 1->2->3
 * 3->2->1
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        List<ListNode> newHead = reverseGroup(head, k);

        ListNode prevGroupEnd = head;
        head = newHead.get(1);
        while (head != null && head.next != null) {
            List<ListNode> newGroup = reverseGroup(head, k);
            prevGroupEnd.next = newGroup.get(0);
            prevGroupEnd = head;
            head = newGroup.get(1);
        }

        return newHead.get(0);
    }

    private List<ListNode> reverseGroup(ListNode head, int k) {
        ListNode groupEnd = head;
        int i = 0;
        for (; i < k - 1 && groupEnd.next != null; i++) {
            groupEnd = groupEnd.next;
        }
        if (i == k - 1) {
            ListNode groupEndNext = groupEnd.next;

            ListNode newHead = reverseList(head, groupEnd);

            head.next = groupEndNext;

            return toList(newHead, head.next);
        }

        return toList(head, groupEnd);
    }

    private List<ListNode> toList(ListNode... nodes) {
        return new ArrayList<>(Arrays.asList(nodes));
    }

    private ListNode reverseList(ListNode start, ListNode end) {
        ListNode prev = start;
        ListNode endNext = end.next;
        start = start.next;

        while (start != endNext) {
            ListNode prevNext = start.next;
            start.next = prev;
            prev = start;
            start = prevNext;
        }

        return prev;
    }
}
