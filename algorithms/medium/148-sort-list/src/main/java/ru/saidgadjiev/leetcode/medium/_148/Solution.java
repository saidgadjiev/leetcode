package ru.saidgadjiev.leetcode.medium._148;

import ru.saidgadjiev.leetcode.common.ListNode;

/**
 * https://leetcode.com/problems/sort-list
 * <p>
 * 3 4 5
 * 1 2
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = head;
        ListNode start = head;
        while (head != null) {
            last = head;
            head = head.next;
        }

        return mergeSort(start, last);
    }

    private ListNode mergeSort(ListNode partStart, ListNode partEnd) {
        if (partStart == partEnd) {
            partStart.next = null;
            return partStart;
        }
        ListNode slow = partStart;
        ListNode fast = partStart;
        while (fast != partEnd && fast.next != partEnd) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next == partEnd) {
            fast = fast.next;
        }
        ListNode slowNext = slow.next;
        ListNode sortedPartStart1 = mergeSort(partStart, slow);
        ListNode sortedPartStart2 = mergeSort(slowNext, fast);

        ListNode sortedList;
        if (sortedPartStart1.val > sortedPartStart2.val) {
            sortedList = sortedPartStart2;
            sortedPartStart2 = sortedPartStart2.next;
        } else {
            sortedList = sortedPartStart1;
            sortedPartStart1 = sortedPartStart1.next;
        }
        ListNode sortedListStart = sortedList;

        while (sortedPartStart1 != null && sortedPartStart2 != null) {
            if (sortedPartStart1.val > sortedPartStart2.val) {
                sortedList.next = sortedPartStart2;
                sortedPartStart2 = sortedPartStart2.next;
            } else {
                sortedList.next = sortedPartStart1;
                sortedPartStart1 = sortedPartStart1.next;
            }
            sortedList = sortedList.next;
        }
        if (sortedPartStart1 == null) {
            sortedList.next = sortedPartStart2;
        } else {
            sortedList.next = sortedPartStart1;
        }

        return sortedListStart;
    }
}
