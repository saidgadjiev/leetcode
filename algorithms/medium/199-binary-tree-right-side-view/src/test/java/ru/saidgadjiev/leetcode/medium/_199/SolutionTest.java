package ru.saidgadjiev.leetcode.medium._199;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<Integer> list = solution.rightSideView(new TreeNode(1, new TreeNode(2), null));
        Assertions.assertEquals(List.of(1, 2), list);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        List<Integer> list = solution.rightSideView(new TreeNode(1, new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3, null, null)));
        Assertions.assertEquals(List.of(1, 3, 4), list);
    }
}