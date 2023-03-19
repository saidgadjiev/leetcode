package ru.saidgadjiev.leetcode.medium._328;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.ListNode;

class SolutionTest {

    @Test
    void case1() {
        ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        Solution solution = new Solution();
        ListNode actual = solution.oddEvenList(root);

        ListNode expected = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(2, new ListNode(4)))));

        while (expected != null) {
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        ListNode actual = solution.oddEvenList(new ListNode(1));
        ListNode expected = new ListNode(1);

        while (expected != null) {
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        ListNode actual = solution.oddEvenList(new ListNode(1, new ListNode(2)));
        ListNode expected = new ListNode(1, new ListNode(2));

        while (expected != null) {
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        ListNode actual = solution.oddEvenList(new ListNode(1, new ListNode(2, new ListNode(3))));
        ListNode expected = new ListNode(1, new ListNode(3, new ListNode(2)));

        while (expected != null) {
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    void case5() {
        Solution solution = new Solution();
        ListNode actual = solution.oddEvenList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        ListNode expected = new ListNode(1, new ListNode(3, new ListNode(2, new ListNode(4))));

        while (expected != null) {
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }
}