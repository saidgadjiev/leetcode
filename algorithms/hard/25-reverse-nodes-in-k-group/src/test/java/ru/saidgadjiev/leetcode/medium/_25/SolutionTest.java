package ru.saidgadjiev.leetcode.medium._25;

import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.CustomAssertions;
import ru.saidgadjiev.leetcode.common.ListNode;
import ru.saidgadjiev.leetcode.common.ListUtil;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        ListNode listNode = solution.reverseKGroup(ListUtil.parseListNode("[1,2,3,4,5]"), 2);
        CustomAssertions.assertEquals(ListUtil.parseListNode("[2,1,4,3,5]"), listNode);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        ListNode listNode = solution.reverseKGroup(ListUtil.parseListNode("[1,2]"), 1);
        CustomAssertions.assertEquals(ListUtil.parseListNode("[1,2]"), listNode);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        ListNode listNode = solution.reverseKGroup(ListUtil.parseListNode("[1,2,3,4]"), 2);
        CustomAssertions.assertEquals(ListUtil.parseListNode("[2,1,4,3]"), listNode);
    }

    @Test
    void case6() {
        Solution solution = new Solution();
        ListNode listNode = solution.reverseKGroup(ListUtil.parseListNode("[1,2,3,4,5,6]"), 2);
        CustomAssertions.assertEquals(ListUtil.parseListNode("[2,1,4,3,6,5]"), listNode);
    }
}