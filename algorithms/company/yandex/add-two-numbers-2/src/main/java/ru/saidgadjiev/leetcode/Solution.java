package ru.saidgadjiev.leetcode;

import ru.saidgadjiev.leetcode.common.ListNode;

/**
 * Складываем числа + перенос если он есть
 * В итоге берем из результата % 10
 * Перенос будет / 10
 * Если в конце остался перенос то записываем его в ответ просто
 * Если закончилось одно из чисел то происходит просто перенос цифр другого числа + перенос
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode head = result;

        int carry = 0;
        while (l1 != null || l2 != null) {
            int resultVal = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = resultVal / 10;

            result.next = new ListNode(resultVal % 10);
            result = result.next;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (carry > 0) {
            result.next = new ListNode(carry);
        }

        return head.next;
    }
}
