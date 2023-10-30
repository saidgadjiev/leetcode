package ru.gadjini.leetcode._2095;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.CustomAssertions;
import ru.saidgadjiev.leetcode.common.ListNode;

class SolutionTest {

    @Test
    void case1() {
        ListNode listNode = new ListNode(1, new ListNode(3,
                new ListNode(4, new ListNode(7, new ListNode(1, new ListNode(2,
                        new ListNode(6)))))));
        Solution solution = new Solution();
        solution.deleteMiddle(listNode);
        CustomAssertions.assertEquals(new ListNode(1, new ListNode(3,
                new ListNode(4, new ListNode(1, new ListNode(2,
                        new ListNode(6)))))), listNode);
    }

    @Test
    void case2() {
        ListNode listNode = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4))));
        Solution solution = new Solution();
        solution.deleteMiddle(listNode);
        CustomAssertions.assertEquals(new ListNode(1, new ListNode(2,
                new ListNode(4))), listNode);
    }

    @Test
    void case3() {
        ListNode listNode = new ListNode(2, new ListNode(1));
        Solution solution = new Solution();
        solution.deleteMiddle(listNode);
        CustomAssertions.assertEquals(new ListNode(2), listNode);
    }

    @Test
    void case4() {
        ListNode listNode = new ListNode(1);
        Solution solution = new Solution();
        ListNode result = solution.deleteMiddle(listNode);
        Assertions.assertNull(result);
    }
}