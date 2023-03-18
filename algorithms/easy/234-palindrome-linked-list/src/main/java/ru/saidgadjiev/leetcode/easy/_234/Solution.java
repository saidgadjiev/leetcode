package ru.saidgadjiev.leetcode.easy._234;

import ru.saidgadjiev.leetcode.common.ListNode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/palindrome-linked-list
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode start = head;
        while (start != null) {
            stack.add(start);
            start = start.next;
        }
        int size = stack.size();
        while(stack.size() > size / 2) {
            ListNode poll = stack.pop();
            if (head.val != poll.val) {
                return false;
            }
            head = head.next;
        }

        return true;
    }
}
