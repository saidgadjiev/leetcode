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
        if (root == null) {
            return "";
        }
        StringBuilder strTree = new StringBuilder();

        strTree.append(root.val).append(",");
        readLevelValues(root.left, strTree, true);
        readLevelValues(root.right, strTree, false);

        String result = strTree.toString();

        return result.substring(0, result.length() - 1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) {
            return null;
        }
        String []parsed = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(parsed[0]));

        int index = writeLevelValues(root, parsed, 1);

        writeLevelValues(root, parsed, index);

        return root;
    }

    private void readLevelValues(TreeNode node, StringBuilder strTree, boolean left) {
        if (node == null) {
            strTree.append("#,");

            return;
        }

        strTree.append(left ? "l:" : "r:").append(node.val).append(",");

        readLevelValues(node.left, strTree, true);
        readLevelValues(node.right, strTree, false);
    }

    private int writeLevelValues(TreeNode node, String []parsed, int index) {
        String args[] = parsed[index].split(":");

        if (args[0].equals("#")) {
            return index + 1;
        }
        int val = Integer.parseInt(args[1]);
        TreeNode tmp = new TreeNode(val);

        if (args[0].equals("l")) {
            node.left = tmp;
        } else if (args[0].equals("r")) {
            node.right = tmp;
        }

        int i = writeLevelValues(tmp, parsed, index + 1);

        return writeLevelValues(tmp, parsed, i);
    }
}
