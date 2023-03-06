package ru.saidgadjiev.leetcode.easy._142;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (true) {
            if (head == null || !set.add(head)) {
                break;
            }
            head = head.next;
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
