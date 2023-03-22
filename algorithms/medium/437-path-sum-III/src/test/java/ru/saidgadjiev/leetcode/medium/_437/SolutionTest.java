package ru.saidgadjiev.leetcode.medium._437;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        int i = solution.pathSum(new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3,
                                new TreeNode(3), new TreeNode(-2)),
                        new TreeNode(2,
                                null, new TreeNode(1))
                ),
                new TreeNode(-3,
                        null, new TreeNode(11))), 8);

        Assertions.assertEquals(3, i);
    }
}