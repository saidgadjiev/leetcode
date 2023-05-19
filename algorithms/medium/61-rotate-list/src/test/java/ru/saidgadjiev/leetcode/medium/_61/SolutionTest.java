package ru.saidgadjiev.leetcode.medium._61;

import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.CustomAssertions;
import ru.saidgadjiev.leetcode.common.ListNode;
import ru.saidgadjiev.leetcode.common.ListUtil;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        ListNode listNode = solution.rotateRight(ListUtil.parseListNode("[1,2,3,4,5]"), 2);
        CustomAssertions.assertEquals(ListUtil.parseListNode("[4,5,1,2,3]"), listNode);
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        ListNode listNode = solution.rotateRight(ListUtil.parseListNode("[0,1,2]"), 4);
        CustomAssertions.assertEquals(ListUtil.parseListNode("[2,0,1]"), listNode);
    }

    @Test
    public void case3() {
        Solution solution = new Solution();
        ListNode listNode = solution.rotateRight(ListUtil.parseListNode("[1,2,3]"), 2000000000);
        CustomAssertions.assertEquals(ListUtil.parseListNode("[2,3,1]"), listNode);
    }

    @Test
    public void case4() {
        Solution solution = new Solution();
        ListNode listNode = solution.rotateRight(ListUtil.parseListNode("[1]"), 2000000000);
        CustomAssertions.assertEquals(ListUtil.parseListNode("[1]"), listNode);
    }

    @Test
    public void case5() {
        Solution solution = new Solution();
        ListNode listNode = solution.rotateRight(ListUtil.parseListNode("[1,2]"), 0);
        CustomAssertions.assertEquals(ListUtil.parseListNode("[1,2]"), listNode);
    }
}