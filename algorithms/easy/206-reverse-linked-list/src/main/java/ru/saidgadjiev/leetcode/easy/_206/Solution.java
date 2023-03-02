package ru.saidgadjiev.leetcode.easy._206;

/**
 * https://leetcode.com/problems/reverse-linked-list
 **/
public class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode result = head.next;
        head = head.next.next;
        result.next = prev;
        prev.next = null;
        while (head != null) {
            prev = result;
            result = head;
            head = head.next;
            result.next = prev;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        list1.val = 1;

        ListNode listNode = new Solution().reverseList(list1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
