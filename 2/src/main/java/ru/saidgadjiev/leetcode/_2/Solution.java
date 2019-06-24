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
        ListNode first;
        ListNode second;
        int lengthL1 = length(l1);
        int lengthL2 = length(l2);

        if (lengthL1 >= lengthL2) {
            first = l1;
            second = l2;
        } else {
            first = l2;
            second = l1;
        }
        int sum = first.val + second.val;
        int inMind = 0;

        if (sum > 9) {
            sum %= 10;
            ++inMind;
        }

        ListNode result = new ListNode(sum);
        ListNode resultHead = result;

        first = first.next;
        second = second.next;
        while (first != null) {
            int secondVal = second == null ? 0 : second.val;

            sum = first.val + secondVal + inMind;
            inMind = 0;

            if (sum > 9) {
                sum %= 10;
                ++inMind;
            }

            result.next = new ListNode(sum);
            result = result.next;

            first = first.next;

            if (second != null) {
                second = second.next;
            }
        }
        if (inMind != 0) {
            result.next = new ListNode(inMind);
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
