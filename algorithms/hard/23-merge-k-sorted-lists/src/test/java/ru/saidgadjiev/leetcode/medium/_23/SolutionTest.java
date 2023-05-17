package ru.saidgadjiev.leetcode.medium._23;

import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.CustomAssertions;
import ru.saidgadjiev.leetcode.common.ListNode;
import ru.saidgadjiev.leetcode.common.ListUtil;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        ListNode listNode = solution.mergeKLists(new ListNode[]{
                ListUtil.parseListNode("[1,4,5]"),
                ListUtil.parseListNode("[1,3,4]"),
                ListUtil.parseListNode("[2,6]")
        });

        CustomAssertions.assertEquals(ListUtil.parseListNode("[1,1,2,3,4,4,5,6]"), listNode);
    }
}