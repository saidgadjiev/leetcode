package ru.saidgadjiev.leetcode.common;

import org.junit.jupiter.api.Assertions;

public class CustomAssertions {

    private CustomAssertions() {

    }

    public static void assertEquals(ListNode listNode1, ListNode listNode2) {
        while (listNode1 != null || listNode2 != null) {
            Assertions.assertEquals(listNode1.val, listNode2.val);
            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
        }
    }
}
