package ru.saidgadjiev.leetcode.medium._328;

import ru.saidgadjiev.leetcode.common.ListNode;

/**
 * https://leetcode.com/problems/odd-even-linked-list/
 *
 * 1 2 3 4 5 -> 1 3 5 2 4
 *
 * Что мы знаем:
 * 1. Список односвязный
 * 2. Надо сгруппировать нечетные и четные ноды с учетом того что надо 1 нечетная 2 четная сохраняя изначальный порядок четных и нечетных
 * 3. Сделать это за M(1) O(n)
 *
 * Варианты решения:
 * Идея: Сделать 2 листа где 1 будет содержать цепочку нечетных второй будет содержать цепочку четных и потом объединить их
 * Реализация:
 * evenHead = head.next
 * oddHead = head
 * цикл пока не прошли весь список:
 * oddNext = evenHead.next
 * evenHead.next = evenHead.next.next
 * evenHead = evenHead.next.next
 *
 * oddHead.next = oddHead.next.next
 * oddHead = oddHead.next.next
 * выход из цикла
 *
 * oddHead.next = evenHead
 *
 * return head
 */
public class Solution {

    public ListNode oddEvenList(ListNode head) {
        if (head != null) {
            ListNode evenHead = head.next;
            ListNode oddHead = head;
            ListNode evenStart = head.next;
            while (evenHead != null && evenHead.next != null) {
                oddHead.next = oddHead.next.next;
                oddHead = oddHead.next;
                evenHead.next = evenHead.next.next;
                evenHead = evenHead.next;
            }

            oddHead.next = evenStart;
        }

        return head;
    }
}
