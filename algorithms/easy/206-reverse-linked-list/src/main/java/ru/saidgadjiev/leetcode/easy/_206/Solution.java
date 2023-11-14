package ru.saidgadjiev.leetcode.easy._206;

import ru.saidgadjiev.leetcode.common.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list
 *
 * 1 2 3 4 5
 *
 * 1->null
 * 2->1->null
 * 3->2->1->null
 * 4->3->2->1->null
 * 5->4->3->2->1->null
 **/
public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTmpNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTmpNode;
        }

        return prev;
    }

}
