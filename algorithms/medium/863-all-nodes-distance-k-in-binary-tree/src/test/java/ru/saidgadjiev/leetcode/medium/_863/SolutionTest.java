package ru.saidgadjiev.leetcode.medium._863;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<Integer> list = solution.distanceK(new TreeNode(3, new TreeNode(5,
                new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(0), new TreeNode(8))), new TreeNode(5), 2);

        Assertions.assertEquals(List.of(), list);
    }
}