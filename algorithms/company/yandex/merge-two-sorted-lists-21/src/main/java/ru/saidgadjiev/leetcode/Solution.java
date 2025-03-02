package ru.saidgadjiev.leetcode;

import ru.saidgadjiev.leetcode.common.ListNode;

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(Integer.MIN_VALUE);
        ListNode resultHead = result;

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                result.next = new ListNode(list2.val);
                list2 = list2.next;
            } else if (list2 == null) {
                result.next = new ListNode(list1.val);
                list1 = list1.next;
            } else if (list1.val < list2.val) {
                result.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                result.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            result = result.next;
        }

        return resultHead.next;
    }
}
