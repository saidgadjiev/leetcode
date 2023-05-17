package ru.saidgadjiev.leetcode.medium._24;

import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.CustomAssertions;
import ru.saidgadjiev.leetcode.common.ListNode;
import ru.saidgadjiev.leetcode.common.ListUtil;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        ListNode listNode = solution.swapPairs(ListUtil.parseListNode("[1,2,3,4]"));
        CustomAssertions.assertEquals(ListUtil.parseListNode("[2,1,4,3]"), listNode);
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        ListNode listNode = solution.swapPairs(ListUtil.parseListNode("[1]"));
        CustomAssertions.assertEquals(ListUtil.parseListNode("[1]"), listNode);
    }

    @Test
    public void case3() {
        Solution solution = new Solution();
        ListNode listNode = solution.swapPairs(ListUtil.parseListNode("[1,2,3,4,5,6,7,8,9]"));
        CustomAssertions.assertEquals(ListUtil.parseListNode("[2,1,4,3,6,5,8,7,9]"), listNode);
    }

    @Test
    public void case4() {
        Solution solution = new Solution();
        ListNode listNode = solution.swapPairs(ListUtil.parseListNode("[1,2,3,4,5,6,7,8,9,10]"));
        CustomAssertions.assertEquals(ListUtil.parseListNode("[2,1,4,3,6,5,8,7,10,9]"), listNode);
    }
}