package ru.saidgadjiev.leetcode.medium._103;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.List;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.zigzagLevelOrder(new TreeNode(3,
                new TreeNode(9, new TreeNode(5), new TreeNode(6)),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))));
        Assertions.assertEquals(List.of(List.of(3), List.of(20, 9), List.of(15, 7)), lists);
    }
}