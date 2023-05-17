package ru.saidgadjiev.leetcode.medium._23;

import ru.saidgadjiev.leetcode.common.ListNode;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        }
        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        ListNode newListNode = new ListNode(0);
        ListNode head = newListNode;

        while (true) {
            ListNode minListNode = new ListNode(Integer.MAX_VALUE);
            int minIndex = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) {
                    continue;
                }
                if (minListNode.val > lists[i].val) {
                    if (minIndex != -1) {
                        lists[minIndex] = minListNode;
                    }
                    minListNode = lists[i];
                    lists[i] = lists[i].next;
                    minIndex = i;
                }
            }
            if (minIndex == -1) {
                break;
            }
            newListNode.next = new ListNode(minListNode.val);
            newListNode = newListNode.next;
        }

        return head.next;
    }
}
