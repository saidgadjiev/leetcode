package ru.saidgadjiev.leetcode._2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addTwoNumbers() {
        ListNode listNode1 = new ListNode(5);

        ListNode listNode2 = new ListNode(5);

        ListNode result = new Solution().addTwoNumbers(listNode1, listNode2);

        Assertions.assertEquals(result.val, 0);
        Assertions.assertEquals(result.next.val, 1);
    }
}