package ru.saidgadjiev.leetcode.medium._148;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.ListNode;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        ListNode root = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));

        ListNode actual = solution.sortList(root);

        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        while (expected != null) {
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        ListNode actual = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        actual = solution.sortList(actual);

        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        assertListsEqual(expected, actual);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        ListNode actual = new ListNode(-1, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(0)))));
        actual = solution.sortList(actual);

        ListNode expected = new ListNode(-1, new ListNode(0, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertListsEqual(expected, actual);
    }

    @Test
    void case4() {
        Solution solution = new Solution();
        ListNode actual = new ListNode(5, new ListNode(3));
        actual = solution.sortList(actual);

        ListNode expected = new ListNode(3, new ListNode(5));
        assertListsEqual(expected, actual);
    }

    private void assertListsEqual(ListNode expected, ListNode actual) {
        while (expected != null) {
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }
}