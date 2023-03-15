package ru.saidgadjiev.leetcode.easy._142;

public class Solution {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if (fast == null || fast.next == null) return null;
        while (head != slow) {
            head = head.next;
            slow = slow.next.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode list2 = new ListNode();
        list2.val = 1;
        list2.next = new ListNode();
        list2.next.val = 3;
        list2.next.next = new ListNode();
        list2.next.next.val = 4;

        list2.next.next.next = new ListNode();
        list2.next.next.next.val = 5;
        list2.next.next.next.next = new ListNode();
        list2.next.next.next.next.val = 6;
        list2.next.next.next.next.next = new ListNode();
        list2.next.next.next.next.next.val = 7;

        list2.next.next.next.next.next.next = new ListNode();
        list2.next.next.next.next.next.next.val = 8;

        list2.next.next.next.next.next.next.next = list2.next;

        ListNode listNode = new Solution().detectCycle(list2);
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
