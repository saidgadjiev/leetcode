package ru.saidgadjiev.leetcode._257;

import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void binaryTreePaths() {
        TreeNode root = new TreeNode(1);

        List<String> paths = new Solution().binaryTreePaths(root);

        System.out.println(paths.toString());
    }
}