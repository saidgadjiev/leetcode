package ru.saidgadjiev.leetcode.easy._21;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;

        if (list1 != null && list2 != null && list1.val < list2.val) {
            result = list1;
            list1 = list1.next;
        } else if (list2 != null) {
            result = list2;
            list2 = list2.next;
        } else if (list1 != null) {
            result = list1;
            list1 = list1.next;
        }
        ListNode start = result;

        while (list1 != null || list2 != null) {
            if (list1 != null && (list2 == null || list1.val < list2.val)) {
                result.next = list1;
                list1 = list1.next;
            } else {
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }

        return start;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        list1.val = 1;
        list1.next = new ListNode();
        list1.next.val = 2;
        list1.next.next = new ListNode();
        list1.next.next.val = 4;

        ListNode list2 = new ListNode();
        list2.val = 1;
        list2.next = new ListNode();
        list2.next.val = 3;
        list2.next.next = new ListNode();
        list2.next.next.val = 4;

        ListNode listNode = new Solution().mergeTwoLists(list1, list2);
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
