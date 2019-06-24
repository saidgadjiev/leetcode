package ru.saidgadjeiv.leetcode._449;

import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class CodecTest {

    @Test
    void serialize() {
        TreeNode treeNode = new TreeNode(1);

        treeNode.setLeft(new TreeNode(2));
        treeNode.setRight(new TreeNode(3));

        String serialize = new Codec().serialize(treeNode);

        System.out.println(serialize);
    }

    @Test
    void deserialize() {
    }
}