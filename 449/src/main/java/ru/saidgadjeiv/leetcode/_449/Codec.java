package ru.saidgadjeiv.leetcode._449;

import ru.saidgadjiev.leetcode.common.TreeNode;

import java.util.*;

/**
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 *
 * Design an algorithm to serialize and deserialize a binary search tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary search tree can be serialized to a string and this string can be deserialized to the original tree structure.
 *
 * The encoded string should be as compact as possible.
 *
 * Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Map<Integer, List<Integer>> levelValues = new HashMap<>();

        readLevelValues(root, 0, levelValues);

        return levelValues.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return null;
    }

    private void readLevelValues(TreeNode node, int level, Map<Integer, List<Integer>> levelValues) {
        if (node == null) {
            return;
        }

        levelValues.putIfAbsent(level, new ArrayList<>());
        levelValues.get(level).add(node.getVal());

        readLevelValues(node.getLeft(), level + 1, levelValues);
        readLevelValues(node.getRight(), level + 1, levelValues);
    }

    private void writeLevelValues(TreeNode node, Map<Integer, Queue<Integer>> levelValues) {

    }
}
