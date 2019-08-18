package ru.saidgadjiev.leetcode._107;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void levelOrderBottom() {
        TreeNode treeNode = new TreeNode(3);

        treeNode.setLeft(new TreeNode(9));
        TreeNode right = treeNode.setRight(new TreeNode(20));

        right.setLeft(new TreeNode(15));
        right.setRight(new TreeNode(7));

        List<List<Integer>> result = new Solution().levelOrderBottom(treeNode);
        List<List<Integer>> expected = new ArrayList<>();

        expected.add(Arrays.asList(15, 7));
        expected.add(Arrays.asList(9, 20));
        expected.add(Collections.singletonList(3));

        Assertions.assertEquals(result, expected);
    }
}