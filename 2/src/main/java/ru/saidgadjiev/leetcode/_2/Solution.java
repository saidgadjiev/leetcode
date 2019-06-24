package ru.saidgadjiev.leetcode._2;

import ru.saidgadjiev.leetcode.common.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 *
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        int inMind = 0;

        if (sum > 9) {
            sum %= 10;
            ++inMind;
        }

        ListNode result = new ListNode(sum);
        ListNode resultHead = result;

        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null) {
            sum = l1.val + l2.val + inMind;
            inMind = 0;

            if (sum > 9) {
                sum %= 10;
                ++inMind;
            }

            result.next = new ListNode(sum);
            result = result.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        return resultHead;
    }

    private int length(ListNode l1) {
        ListNode tmp = l1;
        int length = 0;

        while (tmp != null) {
            tmp = tmp.next;

            ++length;
        }

        return length;
    }
}
